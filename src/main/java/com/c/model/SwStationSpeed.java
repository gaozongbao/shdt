package com.c.model;


public class SwStationSpeed {
    private Integer id;

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
     * 当前时间
     */
    private String time;

    /**
     * 区间加速度
     */
    private Double acceleration;

    /**
     * 当前速度
     */
    private Double currentspeed;

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
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date
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

    /**
     * 获取当前时间
     *
     * @return time - 当前时间
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置当前时间
     *
     * @param time 当前时间
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 获取区间加速度
     *
     * @return acceleration - 区间加速度
     */
    public Double getAcceleration() {
        return acceleration;
    }

    /**
     * 设置区间加速度
     *
     * @param acceleration 区间加速度
     */
    public void setAcceleration(Double acceleration) {
        this.acceleration = acceleration;
    }

    /**
     * 获取当前速度
     *
     * @return currentspeed - 当前速度
     */
    public Double getCurrentspeed() {
        return currentspeed;
    }

    /**
     * 设置当前速度
     *
     * @param currentspeed 当前速度
     */
    public void setCurrentspeed(Double currentspeed) {
        this.currentspeed = currentspeed;
    }
}