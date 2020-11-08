package com.torsello.graphql.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torsello.graphql.training.models.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}
