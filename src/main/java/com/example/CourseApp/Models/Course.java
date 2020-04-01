package com.example.CourseApp.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigInteger;
/**
 * Created by x380342 on 26/03/2020.
 */

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "course")
public class Course {
    @Id
    private BigInteger courseid;

    @Size(max = 50)
    private String coursename;

    @Size(max = 50)
    private String author;

    public Course() {

    }

    public Course(BigInteger courseid, String coursename, String author) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.author = author;
    }

    public BigInteger getCourseid() {
        return courseid;
    }

    public void setCourseid(BigInteger courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

