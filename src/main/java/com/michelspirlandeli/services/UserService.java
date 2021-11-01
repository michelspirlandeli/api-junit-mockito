package com.michelspirlandeli.services;

import com.michelspirlandeli.domain.User;

public interface UserService {
    User findById(Integer id);
}
