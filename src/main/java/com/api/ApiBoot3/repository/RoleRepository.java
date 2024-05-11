package com.api.ApiBoot3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ApiBoot3.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {}