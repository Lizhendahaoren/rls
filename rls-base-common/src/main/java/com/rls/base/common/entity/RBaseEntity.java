package com.rls.base.common.entity;

import com.rls.base.common.annotation.RDescription;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: entity基类
 * @Description : ${todo}
 * @date ：2018/3/24 14:41
 */
@MappedSuperclass
public  abstract class RBaseEntity implements Serializable {

    @RDescription(value = "id", description = "主键")
    @NotNull(message = "主键不能为空")
    protected Long id;

    @RDescription(value = "状态", description = "状态请参考常量定义")
    @NotNull(message = "状态不能为空")
    @org.hibernate.validator.constraints.Length(min = 0, max = 3, message = "状态长度不能大于20")
    protected Integer status;

    @RDescription(value = "版本", description = "hibernate维护")
    protected Integer version;

    @RDescription(description = "创建者")
    @NotNull(message = "创建者不能为空")
    protected Long createUser;

    @RDescription(description = "创建时间")
    @NotNull(message = "创建时间不能为空")
    protected LocalDate createTime;

    @RDescription(description = "修改者")
    protected Long modifyUser;

    @RDescription(description = "修改时间")
    protected LocalDate modifyTime;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @RDescription(value = "状态", description = "确保赋值增加默认值1:正常")
    @Column(nullable = false, length = 3,columnDefinition = "int default 1")
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

    @RDescription(description = "PrePersist该注解数据插入前的操作")
    @PrePersist
    public void setInsertBefore() {

    }

    @RDescription(description = "PreUpdate该数据修改前的操作")
    @PreUpdate
    public void setUpdateBefore() {

    }


}
