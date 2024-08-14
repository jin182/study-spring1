package com.example.demo.user.model;

import com.example.demo.entity.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserEntity extends Entity {
    private String name;
    private int score;
}