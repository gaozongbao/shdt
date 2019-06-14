package com.c.dao;


import java.util.List;
import java.util.Map;

public interface SwStationStartstoptimeMapper {
    public List<Map<String,Object>> getStartStopData(Map<String,Object> param);
}