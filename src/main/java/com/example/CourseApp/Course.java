package com.example.CourseApp;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by x380342 on 26/03/2020.
 */

@Entity
public class Course {
    @Id
    private String courseid;
    private String coursename;
    private String author;

    public Course() {

    }

    public Course(String courseid, String coursename, String author) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.author = author;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
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

