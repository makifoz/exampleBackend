package com.example.Bit.entity;

import java.util.stream.Stream;

public enum Status {

    ACTIVE(1),
    PASSIVE(0),
    DELETED(-1);

    private final Integer value;

    Status(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
