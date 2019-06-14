package com.c.model;


public class SwStationStartstoptime {
    private Integer id;

    private String date;

    /**
     * 站名
     */
    private String stationname;

    /**
     * 线路
     */
    private String line;

    /**
     * 方向
     */
    private String direction;

    /**
     * 进站时刻
     */
    private String intime;

    /**
     * 出站时刻
     */
    private String outtime;

    /**
     * 停靠时长
     */
    private String stopstime;

    /**
     * 区间运行时长
     */
    private String runstime;

    /**
     * 线路-站名
     */
    private String linestation;

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
     * 获取站名
     *
     * @return stationname - 站名
     */
    public String getStationname() {
        return stationname;
    }

    /**
     * 设置站名
     *
     * @param stationname 站名
     */
    public void setStationname(String stationname) {
        this.stationname = stationname;
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
     * 获取进站时刻
     *
     * @return intime - 进站时刻
     */
    public String getIntime() {
        return intime;
    }

    /**
     * 设置进站时刻
     *
     * @param intime 进站时刻
     */
    public void setIntime(String intime) {
        this.intime = intime;
    }

    /**
     * 获取出站时刻
     *
     * @return outtime - 出站时刻
     */
    public String getOuttime() {
        return outtime;
    }

    /**
     * 设置出站时刻
     *
     * @param outtime 出站时刻
     */
    public void setOuttime(String outtime) {
        this.outtime = outtime;
    }

    /**
     * 获取停靠时长
     *
     * @return stopstime - 停靠时长
     */
    public String getStopstime() {
        return stopstime;
    }

    /**
     * 设置停靠时长
     *
     * @param stopstime 停靠时长
     */
    public void setStopstime(String stopstime) {
        this.stopstime = stopstime;
    }

    /**
     * 获取区间运行时长
     *
     * @return runstime - 区间运行时长
     */
    public String getRunstime() {
        return runstime;
    }

    /**
     * 设置区间运行时长
     *
     * @param runstime 区间运行时长
     */
    public void setRunstime(String runstime) {
        this.runstime = runstime;
    }

    /**
     * 获取线路-站名
     *
     * @return linestation - 线路-站名
     */
    public String getLinestation() {
        return linestation;
    }

    /**
     * 设置线路-站名
     *
     * @param linestation 线路-站名
     */
    public void setLinestation(String linestation) {
        this.linestation = linestation;
    }
}