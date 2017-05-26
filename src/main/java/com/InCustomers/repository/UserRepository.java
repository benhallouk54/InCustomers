package com.InCustomers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InCustomers.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
