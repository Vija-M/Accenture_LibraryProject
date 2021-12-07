package com.libraryproject.libraryProject.repositories;

import com.libraryproject.libraryProject.domain.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Integer> {

}
