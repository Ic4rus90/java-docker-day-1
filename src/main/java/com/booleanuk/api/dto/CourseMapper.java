package com.booleanuk.api.dto;

import com.booleanuk.api.model.Course;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    Course toEntity(CourseDTO courseDTO);

    CourseDTO toDTO(Course course);
}
