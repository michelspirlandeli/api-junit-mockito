package com.michelspirlandeli.services.impl;

import com.michelspirlandeli.domain.User;
import com.michelspirlandeli.repositories.UserRepository;
import com.michelspirlandeli.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}