package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User create(User user) {
        user.setId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repository.save(user);
    }

//    private List<User> users = new ArrayList<>();
//
//    public UserService() {
//        users.add(new User(UUID.randomUUID().toString(), "Test 1", "test1@gmail.com"));
//        users.add(new User(UUID.randomUUID().toString(), "Test 2", "test2@gmail.com"));
//        users.add(new User(UUID.randomUUID().toString(), "Test 3", "test3@gmail.com"));
//        users.add(new User(UUID.randomUUID().toString(), "Test 4", "test4@gmail.com"));
//    }
//
//    public List<User> getAllUsers() {
//        return users;
//    }
}
