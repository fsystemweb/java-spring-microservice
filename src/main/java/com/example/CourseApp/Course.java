package com.example.CourseApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

/**
 * Created by x380342 on 26/03/2020.
 */

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Course {
    @Id
    private BigInteger courseid;
    private String coursename;
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

