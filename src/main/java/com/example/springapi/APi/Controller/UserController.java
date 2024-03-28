package com.example.springapi.APi.Controller;

import com.example.springapi.APi.Controller.Model.User;
import com.example.springapi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id) {
        Optional<User> userOptional = userService.getUser(id);
        return userOptional.orElse(null);
    }
}
