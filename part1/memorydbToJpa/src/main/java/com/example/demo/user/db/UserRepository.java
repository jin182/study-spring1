package com.example.demo.user.db;

import com.example.demo.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {


}