package com.example.CourseApp.Repositories;

import com.example.CourseApp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by x380342 on 26/03/2020.
 */


public interface UserRepository extends JpaRepository<User, BigInteger>{

    List<User> findByuserid(BigInteger id);

    List<User> findBycourseid(BigInteger id);
}
