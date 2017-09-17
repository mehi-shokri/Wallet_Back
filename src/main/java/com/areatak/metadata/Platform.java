package com.areatak.metadata;

/**
 * Created by Payam on 9/17/2017.
 */
public enum Platform {
    ANY(9),
    ANDROID(10),
    IOS(11),
    WEB(12);

    private final int value;

    private Platform(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}