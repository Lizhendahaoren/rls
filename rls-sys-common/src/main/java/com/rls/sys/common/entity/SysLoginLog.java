package com.rls.sys.common.entity;

import com.rls.base.common.entity.RBaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 登陆日志
 * @Description : ${todo}
 * @date ：2018/4/16 16:36
 */

@Entity
@Table(name = "rls_sys_login_log")
public class SysLoginLog extends RBaseEntity implements Serializable {

    @NotNull(message = "登陆id不能为空")
    private Long logId;

    @NotNull(message = "ip地址不能为空")
    @org.hibernate.validator.constraints.Length(min = 0, max = 20, message = "ip长度不能大于20")
    private String ipAdress;

    @Column(name = "logId", nullable = false)
    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    @Column(name = "ipAdress", length = 20, nullable = false)
    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }
}
