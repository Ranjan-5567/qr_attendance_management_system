package com.qrams.service;

import com.qrams.model.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public interface CourseService {
    public Course save(Course course);
}
