package com.InCustomers.service;

import com.InCustomers.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
