package com.booleanuk.api.dto;

import com.booleanuk.api.model.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    Student toEntity(StudentDTO studentDTO);

    StudentDTO toDTO(Student student);
}
