package com.libraryproject.librarysystem.controllers;

import com.libraryproject.librarysystem.domain.Authors;
import com.libraryproject.librarysystem.repositories.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class AuthorsControllers {

    @Autowired
    private AuthorsRepository authorRepository;

    @GetMapping(value = "/allAuthors")
    public @ResponseBody
    Iterable<Authors> getAll() {
        return authorRepository.findAll();
    }
}
