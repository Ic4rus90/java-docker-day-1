package com.booleanuk.api.controller;

import com.booleanuk.api.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

}
