package ru.geekbrains.pocket.backend.service;

import ru.geekbrains.pocket.backend.domain.Role;

import java.util.Collection;

public interface RoleService {
    Role getRoleByName(String roleName);

    Role save(Role role);
}
