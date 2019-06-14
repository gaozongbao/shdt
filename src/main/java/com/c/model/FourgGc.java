package com.c.model;


public class FourgGc {
    private Integer id;

    /**
     * 区县
     */
    private String districtandcounty;

    /**
     * 所属e-nodeb
     */
    private String enodeb;

    /**
     * 小区中文名
     */
    private String cellname;

    /**
     * 本地小区标识
     */
    private String localcellid;

    private String cgi;

    /**
     * 跟踪区码
     */
    private String tac;

    /**
     * 物理小区识别码
     */
    private String pci;

    /**
     * 模三
     */
    private Integer mod3;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 小区功率(0.1毫瓦分贝)
     */
    private Double cellpower;

    /**
     * 电子下倾角
     */
    private Double electronictiltangle;

    /**
     * 机械下倾角
     */
    private Double mechanicaltiltangle;

    /**
     * 总下倾角
     */
    private Double totaldowntiltangle;

    /**
     * 方位角
     */
    private Double azimuth;

    /**
     * 天线挂高
     */
    private Double antennaheight;

    /**
     * 设备维护状态
     */
    private String devicestatus;

    /**
     * 管理状态
     */
    private String managestatus;

    /**
     * 覆盖类型
     */
    private String coveragetype;

    /**
     * 覆盖场景
     */
    private String coverscene;

    /**
     * 小区带宽
     */
    private Integer cellbandwidth;

    /**
     * 工作频段
     */
    private String workfrequencyband;

    /**
     * 中心载频的信道号
     */
    private Integer carrierffrequencynum;

    /**
     * 载频数量
     */
    private Integer carrierffrequencycount;

    /**
     * 区域维护部
     */
    private String maintenancedepartment;

    /**
     * 厂家名称
     */
    private String vendor;

    /**
     * 所属网格编号
     */
    private String grid;

    /**
     * 地址
     */
    private String address;

    /**
     * 交维状态
     */
    private String interdimensionalstate;

    /**
     * lte基站本地名
     */
    private String ltebasestationlocalname;

    /**
     * 覆盖距离
     */
    private Double coverdistance;

    /**
     * 半功率角
     */
    private Double halfpowerangle;

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
     * 获取区县
     *
     * @return districtandcounty - 区县
     */
    public String getDistrictandcounty() {
        return districtandcounty;
    }

    /**
     * 设置区县
     *
     * @param districtandcounty 区县
     */
    public void setDistrictandcounty(String districtandcounty) {
        this.districtandcounty = districtandcounty;
    }

    /**
     * 获取所属e-nodeb
     *
     * @return enodeb - 所属e-nodeb
     */
    public String getEnodeb() {
        return enodeb;
    }

    /**
     * 设置所属e-nodeb
     *
     * @param enodeb 所属e-nodeb
     */
    public void setEnodeb(String enodeb) {
        this.enodeb = enodeb;
    }

    /**
     * 获取小区中文名
     *
     * @return cellname - 小区中文名
     */
    public String getCellname() {
        return cellname;
    }

    /**
     * 设置小区中文名
     *
     * @param cellname 小区中文名
     */
    public void setCellname(String cellname) {
        this.cellname = cellname;
    }

    /**
     * 获取本地小区标识
     *
     * @return localcellid - 本地小区标识
     */
    public String getLocalcellid() {
        return localcellid;
    }

    /**
     * 设置本地小区标识
     *
     * @param localcellid 本地小区标识
     */
    public void setLocalcellid(String localcellid) {
        this.localcellid = localcellid;
    }

    /**
     * @return cgi
     */
    public String getCgi() {
        return cgi;
    }

    /**
     * @param cgi
     */
    public void setCgi(String cgi) {
        this.cgi = cgi;
    }

    /**
     * 获取跟踪区码
     *
     * @return tac - 跟踪区码
     */
    public String getTac() {
        return tac;
    }

    /**
     * 设置跟踪区码
     *
     * @param tac 跟踪区码
     */
    public void setTac(String tac) {
        this.tac = tac;
    }

    /**
     * 获取物理小区识别码
     *
     * @return pci - 物理小区识别码
     */
    public String getPci() {
        return pci;
    }

    /**
     * 设置物理小区识别码
     *
     * @param pci 物理小区识别码
     */
    public void setPci(String pci) {
        this.pci = pci;
    }

    /**
     * 获取模三
     *
     * @return mod3 - 模三
     */
    public Integer getMod3() {
        return mod3;
    }

    /**
     * 设置模三
     *
     * @param mod3 模三
     */
    public void setMod3(Integer mod3) {
        this.mod3 = mod3;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取小区功率(0.1毫瓦分贝)
     *
     * @return cellpower - 小区功率(0.1毫瓦分贝)
     */
    public Double getCellpower() {
        return cellpower;
    }

    /**
     * 设置小区功率(0.1毫瓦分贝)
     *
     * @param cellpower 小区功率(0.1毫瓦分贝)
     */
    public void setCellpower(Double cellpower) {
        this.cellpower = cellpower;
    }

    /**
     * 获取电子下倾角
     *
     * @return electronictiltangle - 电子下倾角
     */
    public Double getElectronictiltangle() {
        return electronictiltangle;
    }

    /**
     * 设置电子下倾角
     *
     * @param electronictiltangle 电子下倾角
     */
    public void setElectronictiltangle(Double electronictiltangle) {
        this.electronictiltangle = electronictiltangle;
    }

    /**
     * 获取机械下倾角
     *
     * @return mechanicaltiltangle - 机械下倾角
     */
    public Double getMechanicaltiltangle() {
        return mechanicaltiltangle;
    }

    /**
     * 设置机械下倾角
     *
     * @param mechanicaltiltangle 机械下倾角
     */
    public void setMechanicaltiltangle(Double mechanicaltiltangle) {
        this.mechanicaltiltangle = mechanicaltiltangle;
    }

    /**
     * 获取总下倾角
     *
     * @return totaldowntiltangle - 总下倾角
     */
    public Double getTotaldowntiltangle() {
        return totaldowntiltangle;
    }

    /**
     * 设置总下倾角
     *
     * @param totaldowntiltangle 总下倾角
     */
    public void setTotaldowntiltangle(Double totaldowntiltangle) {
        this.totaldowntiltangle = totaldowntiltangle;
    }

    /**
     * 获取方位角
     *
     * @return azimuth - 方位角
     */
    public Double getAzimuth() {
        return azimuth;
    }

    /**
     * 设置方位角
     *
     * @param azimuth 方位角
     */
    public void setAzimuth(Double azimuth) {
        this.azimuth = azimuth;
    }

    /**
     * 获取天线挂高
     *
     * @return antennaheight - 天线挂高
     */
    public Double getAntennaheight() {
        return antennaheight;
    }

    /**
     * 设置天线挂高
     *
     * @param antennaheight 天线挂高
     */
    public void setAntennaheight(Double antennaheight) {
        this.antennaheight = antennaheight;
    }

    /**
     * 获取设备维护状态
     *
     * @return devicestatus - 设备维护状态
     */
    public String getDevicestatus() {
        return devicestatus;
    }

    /**
     * 设置设备维护状态
     *
     * @param devicestatus 设备维护状态
     */
    public void setDevicestatus(String devicestatus) {
        this.devicestatus = devicestatus;
    }

    /**
     * 获取管理状态
     *
     * @return managestatus - 管理状态
     */
    public String getManagestatus() {
        return managestatus;
    }

    /**
     * 设置管理状态
     *
     * @param managestatus 管理状态
     */
    public void setManagestatus(String managestatus) {
        this.managestatus = managestatus;
    }

    /**
     * 获取覆盖类型
     *
     * @return coveragetype - 覆盖类型
     */
    public String getCoveragetype() {
        return coveragetype;
    }

    /**
     * 设置覆盖类型
     *
     * @param coveragetype 覆盖类型
     */
    public void setCoveragetype(String coveragetype) {
        this.coveragetype = coveragetype;
    }

    /**
     * 获取覆盖场景
     *
     * @return coverscene - 覆盖场景
     */
    public String getCoverscene() {
        return coverscene;
    }

    /**
     * 设置覆盖场景
     *
     * @param coverscene 覆盖场景
     */
    public void setCoverscene(String coverscene) {
        this.coverscene = coverscene;
    }

    /**
     * 获取小区带宽
     *
     * @return cellbandwidth - 小区带宽
     */
    public Integer getCellbandwidth() {
        return cellbandwidth;
    }

    /**
     * 设置小区带宽
     *
     * @param cellbandwidth 小区带宽
     */
    public void setCellbandwidth(Integer cellbandwidth) {
        this.cellbandwidth = cellbandwidth;
    }

    /**
     * 获取工作频段
     *
     * @return workfrequencyband - 工作频段
     */
    public String getWorkfrequencyband() {
        return workfrequencyband;
    }

    /**
     * 设置工作频段
     *
     * @param workfrequencyband 工作频段
     */
    public void setWorkfrequencyband(String workfrequencyband) {
        this.workfrequencyband = workfrequencyband;
    }

    /**
     * 获取中心载频的信道号
     *
     * @return carrierffrequencynum - 中心载频的信道号
     */
    public Integer getCarrierffrequencynum() {
        return carrierffrequencynum;
    }

    /**
     * 设置中心载频的信道号
     *
     * @param carrierffrequencynum 中心载频的信道号
     */
    public void setCarrierffrequencynum(Integer carrierffrequencynum) {
        this.carrierffrequencynum = carrierffrequencynum;
    }

    /**
     * 获取载频数量
     *
     * @return carrierffrequencycount - 载频数量
     */
    public Integer getCarrierffrequencycount() {
        return carrierffrequencycount;
    }

    /**
     * 设置载频数量
     *
     * @param carrierffrequencycount 载频数量
     */
    public void setCarrierffrequencycount(Integer carrierffrequencycount) {
        this.carrierffrequencycount = carrierffrequencycount;
    }

    /**
     * 获取区域维护部
     *
     * @return maintenancedepartment - 区域维护部
     */
    public String getMaintenancedepartment() {
        return maintenancedepartment;
    }

    /**
     * 设置区域维护部
     *
     * @param maintenancedepartment 区域维护部
     */
    public void setMaintenancedepartment(String maintenancedepartment) {
        this.maintenancedepartment = maintenancedepartment;
    }

    /**
     * 获取厂家名称
     *
     * @return vendor - 厂家名称
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * 设置厂家名称
     *
     * @param vendor 厂家名称
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * 获取所属网格编号
     *
     * @return grid - 所属网格编号
     */
    public String getGrid() {
        return grid;
    }

    /**
     * 设置所属网格编号
     *
     * @param grid 所属网格编号
     */
    public void setGrid(String grid) {
        this.grid = grid;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取交维状态
     *
     * @return interdimensionalstate - 交维状态
     */
    public String getInterdimensionalstate() {
        return interdimensionalstate;
    }

    /**
     * 设置交维状态
     *
     * @param interdimensionalstate 交维状态
     */
    public void setInterdimensionalstate(String interdimensionalstate) {
        this.interdimensionalstate = interdimensionalstate;
    }

    /**
     * 获取lte基站本地名
     *
     * @return ltebasestationlocalname - lte基站本地名
     */
    public String getLtebasestationlocalname() {
        return ltebasestationlocalname;
    }

    /**
     * 设置lte基站本地名
     *
     * @param ltebasestationlocalname lte基站本地名
     */
    public void setLtebasestationlocalname(String ltebasestationlocalname) {
        this.ltebasestationlocalname = ltebasestationlocalname;
    }

    /**
     * 获取覆盖距离
     *
     * @return coverdistance - 覆盖距离
     */
    public Double getCoverdistance() {
        return coverdistance;
    }

    /**
     * 设置覆盖距离
     *
     * @param coverdistance 覆盖距离
     */
    public void setCoverdistance(Double coverdistance) {
        this.coverdistance = coverdistance;
    }

    /**
     * 获取半功率角
     *
     * @return halfpowerangle - 半功率角
     */
    public Double getHalfpowerangle() {
        return halfpowerangle;
    }

    /**
     * 设置半功率角
     *
     * @param halfpowerangle 半功率角
     */
    public void setHalfpowerangle(Double halfpowerangle) {
        this.halfpowerangle = halfpowerangle;
    }
}