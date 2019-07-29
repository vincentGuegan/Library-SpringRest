package com.wcsLibrary.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.wcsLibrary.challenge.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);
    
}