package com.org.school.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.org.school.service.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
