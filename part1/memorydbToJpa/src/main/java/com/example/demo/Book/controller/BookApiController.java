package com.example.demo.Book.controller;

import com.example.demo.Book.db.entity.BookEntity;
import com.example.demo.Book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookApiController {

    private final BookService bookService;

    @PostMapping("")
    public BookEntity create(
            @RequestBody BookEntity bookEntity
    ) {
       return bookService.create(bookEntity);
    }
    // all
    @GetMapping("all")
    public List<BookEntity> findAll(){
        return bookService.findAll();
    }

}
