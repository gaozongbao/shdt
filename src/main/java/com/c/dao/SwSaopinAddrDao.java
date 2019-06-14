package com.c.dao;




import java.util.List;
import java.util.Map;

public interface SwSaopinAddrDao {
    public List<Map<String,Object>> getSaoPinInfo(Map<String,Object> param);
    public List<Map<String,Object>> getSaoPinSample(Map<String,Object> param);
}