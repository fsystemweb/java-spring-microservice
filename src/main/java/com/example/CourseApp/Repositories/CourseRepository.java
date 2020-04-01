package com.example.CourseApp.Repositories;

import com.example.CourseApp.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

/**
 * Created by x380342 on 26/03/2020.
 */


public interface CourseRepository extends JpaRepository<Course, BigInteger>{
}
