package com.org.school.response;

import lombok.*;

import java.util.List;

import com.org.Student.Student;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {

    private String name;
    private String email;
    List<Student> students;
}