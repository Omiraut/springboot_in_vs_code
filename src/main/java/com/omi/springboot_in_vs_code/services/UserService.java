package com.omi.springboot_in_vs_code.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omi.springboot_in_vs_code.dto.LoginDTO;

import com.omi.springboot_in_vs_code.model.Users;
import com.omi.springboot_in_vs_code.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public List<Users> createMultipleUsers(List<Users> users) {
        return userRepository.saveAll(users);
    }

    public Optional<Users> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users updateUser(Users user) {
        Optional<Users> optUser = userRepository.findById(user.getUserId());
        if (optUser.isPresent()) {
            Users oldUser = optUser.get();
            oldUser.setEmail(user.getEmail());
            oldUser.setPassword(user.getPassword());
            oldUser.setUsername(user.getUsername());
            oldUser.setName(user.getName());
            return userRepository.save(oldUser);

        } else
            return new Users();
    }

    public String deleteUser(Long id) {
        Optional<Users> optuser = userRepository.findById(id);
        if (optuser.isPresent()) {
            userRepository.deleteById(id);
            return "User Deleted Successfully";
        } else {
            return "No User found With Id No " + id;
        }
    }

    public Users doLogin(LoginDTO user) {
        if (user == null) {
            System.err.println("user is empty");
            return new Users();
        } else {
            Optional<Users> optUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
            if (optUser.isPresent()) {
                Users newUser = optUser.get();
                System.out.println("Mil gaya User iski maka *****");
                return newUser;
            } else {
                System.out.println("User Not Found");
                return new Users();
            }
        }
    }

}
