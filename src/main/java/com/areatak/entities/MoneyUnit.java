package com.areatak.entities;

import com.areatak.common.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Payam on 9/16/2017.
 */
@Entity
@Table(name = "MoneyUnit")
public class MoneyUnit extends BaseEntity {
    @Column(unique = true)
    public Integer code;

    @Column(unique = true)
    public String name;

    @Column
    public String caption;

    @Column
    public String latinCaption;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoneyUnit that = (MoneyUnit) o;
        return code == that.code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getLatinCaption() {
        return latinCaption;
    }

    public void setLatinCaption(String latinCaption) {
        this.latinCaption = latinCaption;
    }

    public static int getBitCoin() {
        return BIT_COIN;
    }

    public static int getLightCoin() {
        return LIGHT_COIN;
    }

    public static int getUtaBit() {
        return UTA_BIT;
    }

    public static int getDASH() {
        return DASH;
    }

    public static int getETHEREUM() {
        return ETHEREUM;
    }

    public static final int BIT_COIN = 1;
    public static final int LIGHT_COIN = 2;
    public static final int UTA_BIT = 3;
    public static final int DASH = 4;
    public static final int ETHEREUM = 5;
}