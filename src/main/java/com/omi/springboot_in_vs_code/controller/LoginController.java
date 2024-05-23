package com.omi.springboot_in_vs_code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omi.springboot_in_vs_code.dto.LoginDTO;
import com.omi.springboot_in_vs_code.model.Users;
import com.omi.springboot_in_vs_code.services.UserService;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public Users doLogin(@RequestBody LoginDTO user) {
        Users newUser = userService.doLogin(user);

        return newUser;
    }

    public String doLogout(String code) {
        return "Logout Successfully";
    }
}
