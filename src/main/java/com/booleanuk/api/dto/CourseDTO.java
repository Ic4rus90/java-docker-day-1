package com.booleanuk.api.dto;

import com.booleanuk.api.model.Student;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CourseDTO {
    @NotBlank(message = "title is required")
    private String title;

    @NotBlank(message = "startDate is required")
    private String startDate;

    @NotBlank(message = "averageGrade is required")
    private char averageGrade;

    Set<Student> students;
}
