package com.example.demo.entity;

public interface PrimaryKey {
    default void setId(long id) {
    }

    Long getId();
}
