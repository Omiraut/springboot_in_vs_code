package com.omi.springboot_in_vs_code.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omi.springboot_in_vs_code.model.Users;
import com.omi.springboot_in_vs_code.services.UserService;

@RestController
public class Controller {

    @Autowired
    UserService userService;

    @PostMapping("/adduser")
    public Users addUser(@RequestBody Users user) {
        return userService.createUser(user);
    }

    @PostMapping("/addusers")
    public List<Users> createMultipleUsers(@RequestBody List<Users> users) {
        return userService.createMultipleUsers(users);
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Users> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/getallusers")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/updateuser")
    public Users updateUser(@RequestBody Users user) {
        return userService.updateUser(user);

    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

}
