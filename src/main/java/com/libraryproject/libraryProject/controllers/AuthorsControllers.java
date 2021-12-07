package com.libraryproject.libraryProject.controllers;


import com.libraryproject.libraryProject.domain.Authors;
import com.libraryproject.libraryProject.repositories.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*@Controller
@RequestMapping(path = "/books")*/
public class AuthorsControllers {

    @Autowired
    private AuthorsRepository authorRepository;

    @GetMapping(value = "/allAuthors")
    public @ResponseBody
    Iterable<Authors> getAll() {
        return authorRepository.findAll();
    }
}
