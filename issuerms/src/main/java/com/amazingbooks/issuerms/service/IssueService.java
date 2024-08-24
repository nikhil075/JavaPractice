package com.amazingbooks.issuerms.service;

import com.amazingbooks.bookms.Model.Book;
import com.amazingbooks.issuerms.BookServiceClient;
import com.amazingbooks.issuerms.model.Issue;
import com.amazingbooks.issuerms.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class IssueService {

    @Autowired
    private IssueRepository issueRepository;

    @Autowired
    private BookServiceClient bookServiceClient;

    public List<Issue> getAllIssuedBooks() {
        return issueRepository.findAll();
    }

    public List<Issue> getIssuedBooksByIsbn(String isbn) {
        return issueRepository.findByIsbn(isbn);
    }

    public Issue issueBook(Issue issue) {
        Book book = bookServiceClient.getBookByIsbn(issue.getIsbn());
        if (book.getTotalCopies() - book.getIssuedCopies() >= issue.getNoOfCopies()) {
            book.setIssuedCopies(book.getIssuedCopies() + issue.getNoOfCopies());
            bookServiceClient.updateBook(issue.getIsbn(), book);
            return issueRepository.save(issue);
        } else {
            throw new IllegalStateException("Not enough copies available");
        }
    }

    public void cancelIssue(Long id) {
        Issue issue = issueRepository.findById(id).orElseThrow();
        Book book = bookServiceClient.getBookByIsbn(issue.getIsbn());
        book.setIssuedCopies(book.getIssuedCopies() - issue.getNoOfCopies());
        bookServiceClient.updateBook(issue.getIsbn(), book);
        issueRepository.delete(issue);
    }
}
