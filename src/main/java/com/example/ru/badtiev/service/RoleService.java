package com.example.ru.badtiev.service;

import com.example.ru.badtiev.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    void addRole(Role role);

    List<Role> listRoles();

    Role getRoleByID(Long id);

    Set<Role> findRolesByName(String roleName);
}