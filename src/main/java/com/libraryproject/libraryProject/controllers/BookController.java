package com.libraryproject.libraryProject.controllers;

import com.libraryproject.libraryProject.domain.Books;
import com.libraryproject.libraryProject.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*@Controller
@RequestMapping(path = "/books")*/
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "/allBooks")
    public @ResponseBody Iterable<Books> getAll () {
        return bookRepository.findAll();
    }
}
