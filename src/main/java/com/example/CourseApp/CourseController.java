package com.example.CourseApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by x380342 on 26/03/2020.
 */

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping("/courses")
    public List<Course> getCourses(){
        return courseRepository.findAll();
    }
}
