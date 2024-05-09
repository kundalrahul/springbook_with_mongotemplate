package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BooksRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Document> getAllBooks() {
        return mongoTemplate.findAll(Document.class,"books");
    }

    public Document add(Document document) {
        return mongoTemplate.insert(document, "books");
    }

    public Document update(Document document, String id) {
    }
}
