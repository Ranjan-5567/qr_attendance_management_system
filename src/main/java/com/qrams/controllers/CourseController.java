package com.qrams.controllers;

import com.qrams.model.Course;
import com.qrams.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseServiceImpl courseService;

    @PostMapping("/save")
    public Course save(Course course){
        return courseService.save(course);
    }
}
