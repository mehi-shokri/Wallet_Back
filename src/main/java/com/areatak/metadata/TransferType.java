package com.areatak.metadata;

/**
 * Created by Payam on 9/17/2017.
 */
public enum TransferType {
    SENT(2),
    RECEIVED(3);

    private final int value;

    private TransferType(int value) {
        this.value = value;
    }

    public static TransferType getTransferType(int value) {
        for (TransferType p : values())
            if (p.getValue() == value) return p;
        return null;
    }

    public int getValue() {
        return this.value;
    }
}
