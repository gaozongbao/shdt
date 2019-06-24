package com.c.dao;


import com.c.model.SwLinesDirection;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SwLinesDirectionDao {


    /**
     * 获取最新批次所有线路
     * @return
     */
    public List<Map<String,Object>> getAllRoutesAndDirection();

    /**
     * 获取单条线路拐点信息
     */
    public List<Map<String,Object>> getBoundaries(@Param("line") String line);
    /**
     * 获取单条线路站点信息
     */
    public List<Map<String,Object>> getStationInfo(@Param("line") String line);

    /**
     * 获取最新批次
     * @return
     */
    public Map<String,Object>getLatestDate();


}