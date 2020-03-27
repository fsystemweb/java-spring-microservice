package com.example.CourseApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
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

    @RequestMapping("/courses/{id}")
    public Course getCourse(@PathVariable("id") BigInteger id){
        return courseRepository.getOne(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/courses")
    public void saveCourse(@RequestBody Course course){
        courseRepository.save(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/courses/{id}")
    public void deleteCourse(@PathVariable("id") BigInteger id){
        courseRepository.deleteById(id);
    }
}
