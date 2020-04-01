package com.example.CourseApp.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigInteger;
/**
 * Created by x380342 on 01/04/2020.
 */

@Entity
@IdClass(UserId.class)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "user")
public class User {
    @Id
    private BigInteger userid;
    @Id
    private BigInteger courseid;

    private String username;

    public User() {

    }

    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public BigInteger getCourseid() {
        return courseid;
    }

    public void setCourseid(BigInteger courseid) {
        this.courseid = courseid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


