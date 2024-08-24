
package com.amazingbooks.issuerms.controller;
import com.amazingbooks.issuerms.model.Issue;
import com.amazingbooks.issuerms.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController

@RequestMapping("/issues")
public class IssueController {

    @Autowired
    private IssueService issueService;

    @GetMapping
    public List<Issue> getAllIssuedBooks() {
        return issueService.getAllIssuedBooks();
    }

    @GetMapping("/{isbn}")
    public List<Issue> getIssuedBooksByIsbn(@PathVariable String isbn) {
        return issueService.getIssuedBooksByIsbn(isbn);
    }

    @PostMapping
    public ResponseEntity<Issue> issueBook(@RequestBody Issue issue) {
        return ResponseEntity.status(HttpStatus.CREATED).body(issueService.issueBook(issue));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelIssue(@PathVariable Long id) {
        issueService.cancelIssue(id);
        return ResponseEntity.noContent().build();
    }
}
