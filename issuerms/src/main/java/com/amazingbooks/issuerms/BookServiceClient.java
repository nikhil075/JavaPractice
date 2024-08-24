package com.amazingbooks.issuerms;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.amazingbooks.bookms.Model.Book;
@ComponentScan
@FeignClient("bookms")
public interface BookServiceClient {

    @GetMapping("/books/{isbn}")
    Book getBookByIsbn(@PathVariable String isbn);

    @PutMapping("/books/{isbn}")
    void updateBook(@PathVariable String isbn, @RequestBody Book book);
}
