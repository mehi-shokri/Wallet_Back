package com.areatak.entities;

import com.areatak.common.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Payam on 9/16/2017.
 */
@Entity
@Table(name = "Constant")
public class Constant extends BaseEntity {
    @Column(unique = true)
    public Integer code;

    @Column(unique = true)
    public String name;

    @Column
    public String title;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}