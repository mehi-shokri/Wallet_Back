package com.areatak.metadata;

/**
 * Created by Payam on 9/17/2017.
 */
public enum WalletStatus {
    INACTIVE(0),
    ACTIVE(1);

    private final int value;

    private WalletStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
