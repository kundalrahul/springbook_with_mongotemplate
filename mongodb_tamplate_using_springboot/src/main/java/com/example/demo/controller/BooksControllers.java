package com.example.demo.controller;

import com.example.demo.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BooksControllers {

    @Autowired
    private BooksService booksService;

    @GetMapping("/")
    public List<Document> getAllBooks() {
        return booksService.getAllBooks();
    }

    @PostMapping("/")
    public Document addBooks(@RequestBody Map<String, Object> book) {
        return booksService.addBooks(book);
    }

    @PutMapping("/")
    public Document update(@RequestBody Map<String, Object> book) {
        return booksService.update(book);
    }

}
