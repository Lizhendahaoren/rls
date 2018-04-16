package com.rls.sys.common.entity;

import com.rls.base.common.annotation.RDescription;
import com.rls.base.common.entity.RBaseEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Target;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 权限
 * @Description : ${todo}
 * @date ：2018/4/9 18:09
 */
@Entity
@Table(name = "rls_sys_permission")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SysPermission extends RBaseEntity implements Serializable {

    @NotNull(message = "资源名称不能为空")
    @org.hibernate.validator.constraints.Length(min = 0, max = 100, message = "资源长度不能大于100")
    private String resourceName;

    @org.hibernate.validator.constraints.Length(min = 0, max = 100, message = "资源地址长度不能大于100")
    @NotNull(message = "资源路径不能为空")
    private String resourceUrl;

    @RDescription("排列顺序:用户菜单上下排序")
    private int orderNum;

    @javax.validation.constraints.NotNull(message = "所属应用不能为空")
    private Long appKeyId;

    @NotNull(message = "显示类型不能为空")
    @RDescription("0: 页面级别 1：按钮级别  2:菜单级")
    private int showType;

    @NotNull(message = "上级模块不能为空")
    private Long parentId;

    @Column(name = "resourceName", length = 30, nullable = false)
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Column(name = "resourceUrl", length = 60, nullable = false)
    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    @Column(name = "orderNum", length = 20, columnDefinition = "INT default 0")
    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    @Column(name = "appKey", length = 20, nullable = false)
    public Long getAppKeyId() {
        return appKeyId;
    }

    public void setAppKeyId(Long appKeyId) {
        this.appKeyId = appKeyId;
    }

    @Column(name = "showType", length = 5, nullable = false, columnDefinition = "INT default 0")
    public int getShowType() {
        return showType;
    }

    public void setShowType(int showType) {
        this.showType = showType;
    }

    @Column(name = "parentId", columnDefinition = "上级菜单")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
