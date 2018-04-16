package com.rls.sys.common.entity;

import com.rls.base.common.entity.RBaseEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 应用
 * @Description : ${todo}
 * @date ：2018/4/9 22:42
 */
@Entity
@Table(name = "rls_sys_app")
public class SysApp extends RBaseEntity implements Serializable {

    @org.hibernate.validator.constraints.Length(min = 0, max = 20, message = "应用名称长度不能大于20")
    @javax.validation.constraints.NotNull(message="应用名称不能为空")
    private String appName;

    @org.hibernate.validator.constraints.Length(min = 0, max = 150, message = "描述长度不能大于150")
    private java.lang.String remark;

    @org.hibernate.validator.constraints.Length(min = 0, max = 100, message = "图标长度不能大于100")
    private java.lang.String icon;

    @org.hibernate.validator.constraints.Length(min = 0, max = 255, message = "应用域名不能大于255")
    @javax.validation.constraints.NotNull(message="应用域名不能为空")
    private java.lang.String appDomain;

    @Column(name = "appName", length = 20, nullable = false)
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Column(name = "remark", length = 150)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "icon", length = 100)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Column(name = "appDomain", length = 255, nullable = false)
    public String getAppDomain() {
        return appDomain;
    }

    public void setAppDomain(String appDomain) {
        this.appDomain = appDomain;
    }
}
