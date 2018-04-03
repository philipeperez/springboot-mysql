package com.ph.mysql.controller;

import com.ph.mysql.dao.UserRepository;
import com.ph.mysql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public @ResponseBody String addNewUser(@RequestBody User user) {
        userRepository.save(user);

        return "Saved";
    }

    @GetMapping
    public @ResponseBody
    ResponseEntity<Iterable<User>> getAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
