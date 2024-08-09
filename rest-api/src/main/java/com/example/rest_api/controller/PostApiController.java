package com.example.rest_api.controller;

import com.example.rest_api.model.BookRequest;
import com.example.rest_api.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {
    @PostMapping("/post")
    public BookRequest post(
            @RequestBody BookRequest bookRequest
            ) {
        System.out.println(bookRequest);
        return bookRequest;
    }
@PostMapping("/user")
    public UserRequest user (
            @RequestBody UserRequest userRequest
    ) {
        System.out.println(userRequest);
        return userRequest;
    }
}
