package com.amine.users.service;

import com.amine.users.entities.Role;
import com.amine.users.entities.User;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}
