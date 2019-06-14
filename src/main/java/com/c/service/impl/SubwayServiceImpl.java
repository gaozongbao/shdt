package com.c.service.impl;

import com.c.dao.*;
import com.c.service.SubwayService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class SubwayServiceImpl implements SubwayService {
    @Autowired
    private SwLinesDirectionDao swLinesDirectionDao;
    @Autowired
    private SwSaopinAddrDao swSaopinAddrDao;
    @Autowired
    private SwStationSpeedMapper swStationSpeedMapper;
    @Autowired
    private SwStationStartstoptimeMapper swStationStartstoptimeMapper;
    @Autowired
    private FourgGcMapper fourgGcMapper;

    @Override
    public List<Map<String, Object>> getAllRoutes() {
        List<Map<String, Object>> res = swLinesDirectionDao.getAllRoutesAndDirection();
        for (Map<String, Object> item:res){
            String dirs = item.get("dirs").toString();
            item.put("direction",dirs.split(","));
            item.remove("dirs");
        }
        return res;
    }

    @Override
    public List<Map<String, Object>> getAllCellInfo(Integer gridid) {
        return fourgGcMapper.getAllCellInfo( gridid);
    }

    @Override
    public List<Map<String, Object>> getAllSanGe() {
        return fourgGcMapper.getAllSanGe();
    }

    @Override
    public List<Map<String, Object>> getAllCellInfoById(Integer id) {
        return fourgGcMapper.getAllCellInfoById(id);
    }

    @Override
    public Map<String, Object> getAllDataBySubway(Map<String, Object> param) {
        Map<String,Object> res = new HashMap<>();
        String line = param.get("line").toString();
        res.put("line",line);
        res.put("direction",param.get("direction"));

        //拐点信息 获取
        List<Map<String, Object>> boundaries = swLinesDirectionDao.getBoundaries(line);
        String boundariesStr="";
        for (Map<String, Object> item:boundaries){
            boundariesStr += (item.get("lonlat").toString()+";");
        }
        if(StringUtils.isNotBlank(boundariesStr)){
            boundariesStr =boundariesStr.substring(0,boundariesStr.length()-1);
        }
        res.put("boundaries",new Object[]{boundariesStr});

        //站点信息
        List<Map<String, Object>> stationInfo = swLinesDirectionDao.getStationInfo(line);
        res.put("stationInfo",stationInfo);


        //扫频点信息
        List<Map<String, Object>> saoPinInfo = swSaopinAddrDao.getSaoPinInfo(param);
        res.put("saoPinInfo",saoPinInfo);


        //加速度 和速度
        List<Map<String, Object>> speeds = swStationSpeedMapper.getSpeedByLine(param);
        List<Map<String,Object>> speedRes = new ArrayList<>();
        List<Map<String,Object>> speedPlusRes = new ArrayList<>();
        List<Map<String,Object>> startStopData = new ArrayList<>();
        for (Map<String, Object> item:speeds){
            /*******************速度曲线*********************************/
            Map<String,Object> speedItem = new HashMap<>();
            speedItem.put("time",item.get("time"));
            speedItem.put("value",item.get("currentspeed"));
            speedRes.add(speedItem);
            /********************加速度曲线********************************/
            Map<String,Object> speedPlusItem = new HashMap<>();
            speedPlusItem.put("time",item.get("time"));
            speedPlusItem.put("value",item.get("acceleration"));
            speedPlusRes.add(speedPlusItem);
            /********************启停曲线*********************************/
            Map<String,Object> startStopDataItem = new HashMap<>();
            startStopDataItem.put("time",item.get("time"));
            startStopDataItem.put("value",item.get("driverstatus"));
            startStopData.add(startStopDataItem);

        }
        res.put("speed",speedRes);
        res.put("speedPlus",speedPlusRes);

        //启停数据
        //List<Map<String, Object>> startStopData = swStationStartstoptimeMapper.getStartStopData(param);
        res.put("moveTime",startStopData);

        //采样分布
        String [] arr=new String[]{"移动-TDD/FDD/GSM","联通-TDD/FDD","电信-TDD/FDD"};
        for(String str :arr){
            String op = str.split("-")[0];
            String [] types = str.split("-")[1].split("/");
            Map<String,Object> sampleRes = new HashMap<>();
            for(String type:types){
                Map<String,Object> sampleParam = new HashMap<>();
                sampleParam.put("line",line);
                sampleParam.put("direction",param.get("direction"));
                sampleParam.put("operator",op);
                sampleParam.put("pattern",type);
                sampleParam.put("type",0);
                //获取对应制式采样分布
                List<Map<String, Object>> saoPinSample = swSaopinAddrDao.getSaoPinSample(sampleParam);
                sampleRes.put(type.toLowerCase(),saoPinSample);
                //获取对应制式 覆盖率
                sampleParam.put("type",1);
                List<Map<String, Object>> saoPinCoverRate = swSaopinAddrDao.getSaoPinSample(sampleParam);
                if(saoPinCoverRate.size()>0){
                    sampleRes.put(type.toLowerCase()+"Cover",saoPinCoverRate.get(0).get("value"));
                }else{
                    sampleRes.put(type.toLowerCase()+"Cover",0);
                }

            }
            if(op.equals("移动")){
                res.put("yidong",sampleRes);
            }else if(op.equals("联通")){
                res.put("liantong",sampleRes);
            }else{
                res.put("dianxin",sampleRes);
            }

        }



        return res;
    }


}
