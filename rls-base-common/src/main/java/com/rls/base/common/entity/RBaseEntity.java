package com.rls.base.common.entity;

import com.rls.base.common.annotation.RDescription;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: entity基类
 * @Description : ${todo}
 * @date ：2018/3/24 14:41
 */
public abstract class RBaseEntity implements Serializable {

    @RDescription(value = "id", description = "主键")
    private Long tId;

    @RDescription(value = "状态", description = "状态请参考常量定义")
    private Integer status;

    @RDescription(value = "版本", description = "hibernate维护")
    private Integer version;

    @RDescription(description = "创建者")
    private Long createUser;

    @RDescription(description = "创建时间")
    private LocalDate createTime;

    @RDescription(description = "修改者")
    private Long modifyUser;

    @RDescription(description = "修改时间")
    private LocalDate modifyTime;

    @RDescription(description = "修改描述")
    private String modifyDescription;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED")
    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }


    @RDescription(value = "状态", description = "确保赋值增加默认值1:正常")
    @Column(nullable = false, columnDefinition = "int default 1")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Version
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Column(name = "createUser")
    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }


    @Column(name = "modifyUser")
    public Long getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    @Column(name = "createTime")
    public LocalDate getCreateTime() {
        return createTime;
    }

    @Column(name = "modifyTime")
    public LocalDate getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDate modifyTime) {
        this.modifyTime = modifyTime;
    }


    @Column(name = "modifyDescription", length = 500)
    public String getModifyDescription() {
        return modifyDescription;
    }

    public void setModifyDescription(String modifyDescription) {
        this.modifyDescription = modifyDescription;
    }

    @RDescription(description = "PrePersist该注解数据插入前的操作")
    @PrePersist
    public void setInsertBefore() {

    }

    @RDescription(description = "PreUpdate该数据修改前的操作")
    @PreUpdate
    public void setUpdateBefore() {

    }


}
