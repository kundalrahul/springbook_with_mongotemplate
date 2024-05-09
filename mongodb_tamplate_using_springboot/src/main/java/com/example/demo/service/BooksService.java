package com.example.demo.service;

import com.example.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;

    public List<Document> getAllBooks() {
        return booksRepository.getAllBooks();
    }

    public Document addBooks(Map<String, Object> book) {
        Document document = new Document(book);
        return booksRepository.add(document);

    }


    public Document update(Map<String, Object> book) {
        Document document = new Document(book);
        String id = document.getString("id");
        document.remove("id");
        return booksRepository.update(document, id);

    }
}
