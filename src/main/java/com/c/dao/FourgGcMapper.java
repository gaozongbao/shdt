package com.c.dao;


import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FourgGcMapper  {
    public List<Map<String,Object>> getAllCellInfo(@Param("gridid")Integer gridid);
    public List<Map<String,Object>> getAllSanGe();
    public List<Map<String,Object>> getAllCellInfoById(@Param("id") Integer id);
}