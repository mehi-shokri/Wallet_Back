package com.areatak.entities;

import com.areatak.common.entities.BaseEntity;
import com.areatak.metadata.WalletStatus;

import javax.persistence.*;

/**
 * Created by Payam on 9/16/2017.
 */
@Entity
@Table(name = "WalletType")
public class WalletType extends BaseEntity {

    @Column(unique = true)
    public Integer code;

    @OneToOne
    public MoneyUnit moneyUnit;

    @Column(unique = true)
    public Integer position;

    @Column
    public String url;

    @Enumerated(EnumType.ORDINAL)
    public WalletStatus status;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public MoneyUnit getMoneyUnit() {
        return moneyUnit;
    }

    public void setMoneyUnit(MoneyUnit moneyUnit) {
        this.moneyUnit = moneyUnit;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WalletStatus getStatus() {
        return status;
    }

    public void setStatus(WalletStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WalletType that = (WalletType) o;
        return code == that.code;
    }

}
