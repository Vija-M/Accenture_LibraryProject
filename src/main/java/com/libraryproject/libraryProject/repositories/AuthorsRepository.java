package com.libraryproject.libraryProject.repositories;

import com.libraryproject.libraryProject.domain.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorsRepository extends JpaRepository<Authors, Integer> {

}

