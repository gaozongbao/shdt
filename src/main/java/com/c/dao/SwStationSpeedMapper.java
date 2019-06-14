package com.c.dao;


import java.util.List;
import java.util.Map;

public interface SwStationSpeedMapper  {
    public List<Map<String,Object>> getSpeedByLine(Map<String,Object> param);
}