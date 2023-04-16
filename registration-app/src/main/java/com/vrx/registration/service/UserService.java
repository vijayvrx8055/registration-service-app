package com.vrx.registration.service;

import com.vrx.registration.entity.User;

public interface UserService {
    public User createUser(User user);

    public boolean checkEmail(String email);
}
