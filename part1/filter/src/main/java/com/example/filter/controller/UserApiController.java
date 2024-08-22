package com.example.filter.controller;

import com.example.filter.interceptor.OpenApi;
import com.example.filter.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserApiController {
    @OpenApi
    @PostMapping("")
    public UserRequest register(
            @RequestBody
            UserRequest userRequest

    ) {
        log.info("{}", userRequest);
        return userRequest;
    }
    @GetMapping("/hello")
    public void hello() {
        log.info("hello");
    }

}
