package com.c.service;

import java.util.List;
import java.util.Map;

public interface SubwayService {
    public List<Map<String,Object>> getAllRoutes();
    public List<Map<String,Object>> getAllCellInfo();
    public List<Map<String,Object>> getAllSanGe();
    public List<Map<String,Object>> getAllCellInfoById(Integer id);

    /**
     * 获取单条线路所有数据
     * @param param
     * @return
     */
    public Map<String,Object> getAllDataBySubway(Map<String,Object> param);
}
