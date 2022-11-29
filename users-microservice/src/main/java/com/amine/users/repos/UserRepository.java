package com.amine.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amine.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}