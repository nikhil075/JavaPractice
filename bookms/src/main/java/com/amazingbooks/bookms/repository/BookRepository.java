package com.amazingbooks.bookms.repository;

import com.amazingbooks.bookms.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book, String> {
}
