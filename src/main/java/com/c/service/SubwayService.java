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
     * @return
     */
    public Map<String,Object> getAllDataBySubway(Map<String,Object> param);
}
