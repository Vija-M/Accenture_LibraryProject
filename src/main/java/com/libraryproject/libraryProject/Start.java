package com.libraryproject.libraryProject;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Start {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LibrarySystem");
    }
}
