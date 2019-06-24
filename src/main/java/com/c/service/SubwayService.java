package com.c.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SubwayService {
    public List<Map<String,Object>> getAllRoutes();
    public List<Map<String,Object>> getAllCellInfo(@Param("gridid") Integer gridid);
    public List<Map<String,Object>> getAllSanGe();
    public List<Map<String,Object>> getAllCellInfoById(Integer id);

    /**
     * 获取单条线路所有数据
     * @param param
     *
     * 参数 以map 集合 存放
     *          line --线路
     *          operator -- 运营商 移动/联通/电信
     *          pattern --制式  FDD/TDD/GSM/ALL
     *          direction --方向  正向/反向
     *          severPath --服务器路径 用于图片
     *          date -- 最新批次时间
     *
     * @return
     *  返回值
     *      以map集合存放
     *              {
     * 					  "line": "线路名称",
     * 					  "linenum":"M13",
     * 					  "direction":"方向",
     * 					  "boundaries": "112.2,22.0;112.2,22.0",#拐点信息
     * 					  "stationInfo":[{id:1,"lon":112.2,"lat":24.0,stationname:"站点名称",isLast:"1/2"}],#站点信息 isLast 1是 2 不是
     * 					  "saoPinInfo":[{id:1,"lon":112.2,"lat":24.0,"rsrp":-88.0}],#扫频点
     * 					  "speedPlus":[{time:"13:26:21",value:0.123}],#加速度
     * 					  "speed":[{"time":"13:26:21","value":0.123}],#速度
     * 					  "moveTime":[{"time":"13:26:21","value":0}],#进出站
     * 					  "linenum":"",#地铁线num
     * 					  "imgUrl":"/shdt/images/aa.jpg",#该线路对应图片
     * 					  "rsrpChart":[{"time":"13:26:21","value":0,"lon":"131","lat":"22"}],#rsrp对应
     * 					  "sample":[{"region":"0-70","value":20,"index":1},{"region":"70-80","value":80,"index":2}],#采样分布
     * 					  "yidong":{
     * 							"fddCover":20,#fdd 覆盖率指标
     * 							"tddCover":20,#tdd 覆盖率指标
     * 							"gsmCover":20,#gsm 覆盖率指标
     * 							"allCover":20,#不分制式 覆盖率指标
     * 							"tpsCover":20,#5g 2.6覆盖率
     * 							"fpnCover":20,#5g 4.9覆盖率
     * 					  "liantong":{
     * 							"fddCover":20,#fdd 覆盖率指标
     * 							"tddCover":20,#tdd 覆盖率指标
     * 							"allCover":20,#不分制式 覆盖率指标
     *                      },
     * 					  "dianxin":{
     * 							"fddCover":20,#fdd 覆盖率指标
     * 							"tddCover":20,#tdd 覆盖率指标
     * 							"allCover":20,#不分制式 覆盖率指标
     *                      }
     *
     * 				}
     */
    public Map<String,Object> getAllDataBySubway(Map<String,Object> param);

    /**
     * 获取最新批次
     * @return
     */
    public Map<String,Object> getLatestDate();
}
