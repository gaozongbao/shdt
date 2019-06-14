package com.c.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.c.service.SubwayService;
import com.c.util.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*")
public class SubwayController {
    @Autowired
    private SubwayService subwayService;

    @RequestMapping("/subway/getAllRoutes")
    @ResponseBody
    public ResponseEntity getAllRoutes(){
        return  ResponseEntity.successResponse(subwayService.getAllRoutes(), "success");
    }
    @RequestMapping("/subway/initData")
    @ResponseBody
    public ResponseEntity initData(String operator,String pattern,@RequestParam(value = "line", required = true)String line,String direction){
        String[] lines = line.split(",");
        List<Map<String,Object>> res = new ArrayList<>();
        for (String item: lines) {
            Map<String,Object> param = new HashMap<>();
            param.put("line",item);
            param.put("operator",operator);
            param.put("pattern",pattern);
            param.put("direction",direction);
            Map<String, Object> allDataBySubway = subwayService.getAllDataBySubway(param);
            res.add(allDataBySubway);
        }
        return  ResponseEntity.successResponse(res, "success");
    }
    @RequestMapping("/subway/allCellInfo")
    @ResponseBody
    public ResponseEntity getAllCellInfo(){

        return  ResponseEntity.successResponse(subwayService.getAllCellInfo(), "success");
    }
    @RequestMapping("/subway/getAllSanGe")
    @ResponseBody
    public ResponseEntity getAllSanGe(){

        return  ResponseEntity.successResponse(subwayService.getAllSanGe(), "success");
    }
    @RequestMapping("/subway/cellInfo")
    @ResponseBody
    public ResponseEntity cellInfo(@RequestParam(value = "id", required = true)Integer id){
        return  ResponseEntity.successResponse(subwayService.getAllCellInfoById(id), "success");
    }

}
