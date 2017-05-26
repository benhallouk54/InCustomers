package com.InCustomers.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long>{
}