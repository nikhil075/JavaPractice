package com.amazingbooks.issuerms.repository;
import com.amazingbooks.issuerms.model.Issue;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public interface IssueRepository extends JpaRepository<Issue, Long> {
    List<Issue> findByIsbn(String isbn);
}
