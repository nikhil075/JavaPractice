package com.org.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.Student.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}

