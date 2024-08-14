package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public abstract class Entity {
    private Long id;

    // 기본 생성자 추가
    protected Entity() {}
}