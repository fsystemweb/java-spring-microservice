package com.example.CourseApp.Controllers;

import com.example.CourseApp.Models.User;
import com.example.CourseApp.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by x380342 on 26/03/2020.
 */

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @RequestMapping("/users/{id}")
    public List<User> getByUserid(@PathVariable("id") BigInteger id){
        return userRepository.findByuserid(id);
    }

    @RequestMapping("/users/course/{id}")
    public List<User> getByCourseid(@PathVariable("id") BigInteger id){
        return userRepository.findBycourseid(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/users")
    public void saveUser(@RequestBody User user){
        userRepository.save(user);
    }


}
