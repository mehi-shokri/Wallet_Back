package com.areatak.metadata;

/**
 * Created by Payam on 9/17/2017.
 */
public enum UserStatus {
    PENDING(4),
    CHECKING(5),
    ACCEPTED(6),
    REJECTED(7),
    DELETED(8);

    private final int value;

    private UserStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
