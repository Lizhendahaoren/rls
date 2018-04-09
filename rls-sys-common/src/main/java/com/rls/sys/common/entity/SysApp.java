package com.rls.sys.common.entity;

import com.rls.base.common.entity.RBaseEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Entity;
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
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SysApp extends RBaseEntity implements Serializable {

    private String appName;

    @org.hibernate.validator.constraints.Length(min = 0, max = 60, message = "描述长度不能大于60")
    private java.lang.String remark;

    @org.hibernate.validator.constraints.Length(min = 0, max = 20, message = "图标长度不能大于20")
    private java.lang.String icon;

    @org.hibernate.validator.constraints.Length(min = 0, max = 300, message = "应用域名不能大于300")
    private java.lang.String appDomain;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAppDomain() {
        return appDomain;
    }

    public void setAppDomain(String appDomain) {
        this.appDomain = appDomain;
    }
}
