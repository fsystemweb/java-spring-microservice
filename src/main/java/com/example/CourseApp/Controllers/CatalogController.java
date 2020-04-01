package com.example.CourseApp.Controllers;

import com.example.CourseApp.Models.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by x380342 on 30/03/2020.
 */

@RestController
public class CatalogController {

    @RequestMapping("/catalog")
    public String getCatalogHome(){
        String courses = "";
        String courseAppURL = "http://localhost:8090/courses";

        RestTemplate restTemplate = new RestTemplate();

        courses = restTemplate.getForObject(courseAppURL, String.class);

        return ("Our courses: "+courses);
    }

    @RequestMapping("/firstcourse")
    public String getFirstCatalog(){
        Course course= new Course();
        String courseAppURL = "http://localhost:8090/courses/100";

        RestTemplate restTemplate = new RestTemplate();

        course = restTemplate.getForObject(courseAppURL, Course.class);

        return ("Our firts course: "+course.getCoursename());
    }
}
