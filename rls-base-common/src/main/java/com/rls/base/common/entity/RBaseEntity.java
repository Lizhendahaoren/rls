package com.rls.base.common.entity;

import java.beans.Transient;
import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: entity基类
 * @Description : ${todo}
 * @date ：2018/3/24 14:41
 */
public abstract class RBaseEntity implements Serializable {
    /*
     * ID
     */

    private Long tId;

    // "状态，0为无效，1为正常,3删除 参看XaConstant.Status")
    private Integer status;

    // "版本,hibernate维护")
    private Integer version;

    // "@Fields createUser : 创建者")
    private Long createUser;

   //"@Fields createTime : 创建时间")
    private Long createTime;

    //" 创建时间 字符串形式")
    private String createTimeStr;

    //@Fields modifyUser : 修改者")
    private Long modifyUser;

    //@Fields modifyTime : 修改时间")
    private Long modifyTime;

   // "修改时间 字符串")
    private String modifyTimeStr;

   //Fields modifyDescription : 修改描述")
    private String modifyDescription;


    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public Long getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyTimeStr() {
        return modifyTimeStr;
    }

    public void setModifyTimeStr(String modifyTimeStr) {
        this.modifyTimeStr = modifyTimeStr;
    }

    public String getModifyDescription() {
        return modifyDescription;
    }

    public void setModifyDescription(String modifyDescription) {
        this.modifyDescription = modifyDescription;
    }
}
