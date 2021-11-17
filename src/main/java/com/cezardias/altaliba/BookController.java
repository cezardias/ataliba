package com.cezardias.altaliba.controller;

import com.cezardias.altaliba.Book;
import com.cezardias.altaliba.BookRepository;
import com.cezardias.altaliba.dto.MessageResponseDTO;
import com.cezardias.altaliba.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) { 
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public MessageResponseDTO create (@RequestBody Book book){
        Book savedBook = bookRepository.save(book)
        return MessageResponseDTO.builder()
                .message("Book created with ID" + savedBook.getId())
                .build()
    }

}
