package com.amazingbooks.bookms.service;
import com.amazingbooks.bookms.Model.Book;
import com.amazingbooks.bookms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
    public Optional<Book> getBook(String isbn) {
        return bookRepository.findById(isbn);
    }
    public Book updateBook(String isbn, Book book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }
    public void deleteBook(String isbn) {
        bookRepository.deleteById(isbn);
    }
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}

