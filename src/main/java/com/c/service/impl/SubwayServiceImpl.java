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
        //由于前端给的线路带() 所以先处理
        String dealLine=line;

        if(dealLine.indexOf("(")!=-1){
            dealLine = dealLine.substring(0,dealLine.indexOf("("));
        }else if(dealLine.indexOf("（")!=-1){
            dealLine = dealLine.substring(0,dealLine.indexOf("（"));
        }
        res.put("linenum",dealLine);

        String imgUrl="/shdt/images/"+dealLine+".JPG";
        //返回图片路径
        if(line.indexOf("M10")!=-1&&line.indexOf("虹桥")!=-1){
            imgUrl="/shdt/images/M10(虹桥方向).JPG";
        }else if(line.indexOf("M10")!=-1&&line.indexOf("虹桥")==-1){
            imgUrl="/shdt/images/M10(航中路方向).jpg";
        }else if(line.indexOf("M11")!=-1&&line.indexOf("嘉定")!=-1){
            imgUrl="/shdt/images/M11(嘉定北方向).jpg";
        }else if(line.indexOf("M11")!=-1&&line.indexOf("嘉定")==-1){
            imgUrl="/shdt/images/M11(花桥方向).jpg";
        }
        res.put("imgUrl",param.get("severPath").toString()+imgUrl);


        //不需要返回 节点信息
       /* List<Map<String, Object>> boundaries = swLinesDirectionDao.getBoundaries(dealLine);
        String boundariesStr="";
        for (Map<String, Object> item:boundaries){
            boundariesStr += (item.get("lonlat").toString()+";");
        }
        if(StringUtils.isNotBlank(boundariesStr)){
            boundariesStr =boundariesStr.substring(0,boundariesStr.length()-1);
        }

        res.put("boundaries",new Object[]{boundariesStr});
        */


        //站点信息
        List<Map<String, Object>> stationInfo = swLinesDirectionDao.getStationInfo(dealLine);
        boolean isNormal =true;
        for(Map<String, Object> item:stationInfo){
            if(item.get("isLast").toString().equals("1")){
                isNormal =false;
                break;
            }
        }
        //如果是正常路线 终点站没有标识1 如果后去最后一个作为终点站
        if(isNormal&&stationInfo.size()>0){
            Map<String, Object> routes = stationInfo.get(stationInfo.size() - 1);
            routes.put("isLast",1);
        }

        res.put("stationInfo",stationInfo);


        //扫频点信息
        List<Map<String, Object>> saoPinInfo = swSaopinAddrDao.getSaoPinInfo(param);
        for (Map<String, Object> item:saoPinInfo) {
            if(item.get("ids")!=null){
                String[] ids = item.get("ids").toString().split(",");
                for(String idkey:ids){
                    if(item.get("rsrp")!=null&&idkey.indexOf(item.get("rsrp").toString())!=-1){
                        item.put("id",idkey.split(":")[0]);
                        item.remove("ids");
                        break;
                    }
                }
            }
        }
        res.put("saoPinInfo",saoPinInfo);


        //加速度 和速度
        List<Map<String, Object>> speeds = swStationSpeedMapper.getSpeedByLine(param);
        List<Map<String,Object>> speedRes = new ArrayList<>();
        List<Map<String,Object>> speedPlusRes = new ArrayList<>();
        List<Map<String,Object>> startStopData = new ArrayList<>();
        List<Map<String,Object>> rsrpData = new ArrayList<>();
        int i=0;
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

            /********************rsrp*********************************/
            Map<String,Object> rsrpDataItem = new HashMap<>();
            if((item.get("longitude")==null||item.get("latitude")==null)&&i>0){
                rsrpDataItem.put("value",rsrpData.get(i-1).get("value"));
                rsrpDataItem.put("lon",rsrpData.get(i-1).get("lon"));
                rsrpDataItem.put("lat",rsrpData.get(i-1).get("lat"));
            }else{
                rsrpDataItem.put("value",item.get("rsrp"));
                rsrpDataItem.put("lon",item.get("longitude"));
                rsrpDataItem.put("lat",item.get("latitude"));

            }
            rsrpDataItem.put("time",item.get("time"));
            rsrpData.add(rsrpDataItem);
            i++;
        }
        res.put("speed",speedRes);
        res.put("speedPlus",speedPlusRes);
        res.put("rsrpChart",rsrpData);

        //启停数据
        //List<Map<String, Object>> startStopData = swStationStartstoptimeMapper.getStartStopData(param);
        res.put("moveTime",startStopData);

        //采样分布
        //获取对应制式采样分布
        param.put("type",0);
        List<Map<String, Object>> saoPinSample = swSaopinAddrDao.getSaoPinSample(param);
        res.put("sample",saoPinSample);

        String [] arr=new String[]{"移动-TDD/FDD/GSM/ALL/TPS/FPN","联通-TDD/FDD/ALL","电信-TDD/FDD/ALL"};
        for(String str :arr){
            String op = str.split("-")[0];
            String [] types = str.split("-")[1].split("/");
            Map<String,Object> sampleRes = new HashMap<>();
            for(String type:types){
                //获取对应制式 覆盖率
                Map<String,Object> coverParam = new HashMap<>();
                coverParam.put("line",line);
                coverParam.put("direction",param.get("direction"));
                coverParam.put("operator",op);
                coverParam.put("pattern",type);
                coverParam.put("type",1);
                coverParam.put("date",param.get("date"));
                List<Map<String, Object>> saoPinCoverRate = swSaopinAddrDao.getSaoPinSample(coverParam);
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

    @Override
    public Map<String, Object> getLatestDate() {
        return swLinesDirectionDao.getLatestDate();
    }


}
