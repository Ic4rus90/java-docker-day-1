package com.booleanuk.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}
