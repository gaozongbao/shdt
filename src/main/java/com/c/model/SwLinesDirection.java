package com.c.model;


public class SwLinesDirection {
    private Integer id;

    /**
     * 数据批次信息
     */
    private String date;

    /**
     * 线路
     */
    private String line;

    /**
     * 方向
     */
    private String direction;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取数据批次信息
     *
     * @return date - 数据批次信息
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置数据批次信息
     *
     * @param date 数据批次信息
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 获取线路
     *
     * @return line - 线路
     */
    public String getLine() {
        return line;
    }

    /**
     * 设置线路
     *
     * @param line 线路
     */
    public void setLine(String line) {
        this.line = line;
    }

    /**
     * 获取方向
     *
     * @return direction - 方向
     */
    public String getDirection() {
        return direction;
    }

    /**
     * 设置方向
     *
     * @param direction 方向
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }
}