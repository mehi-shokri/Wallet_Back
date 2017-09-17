package com.areatak.entities;


import com.areatak.common.entities.BaseEntity;
import com.areatak.metadata.Platform;

import javax.persistence.*;

/**
 * Created by alirezaghias on 3/12/2017 AD.
 */
@Entity
@Table(name = "Device")
public class Device extends BaseEntity {
    @Column(unique = true)
    public String token;

    @Column
    public String info;

    @Column
    @Enumerated(EnumType.ORDINAL)
    public Platform platform;

    @Column
    public Double version;

    @Column
    public Long buildNumber;

    @Column
    public String cid;

    @Column
    public String fid;

    @Column
    public String deviceId;

    @ManyToOne
    public User user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public Long getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(Long buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
