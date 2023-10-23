package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(UUID.randomUUID().toString(), "Test 1", "test1@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "Test 2", "test2@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "Test 3", "test3@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "Test 4", "test4@gmail.com"));
    }

    public List<User> getAllUsers() {
        return users;
    }
}
