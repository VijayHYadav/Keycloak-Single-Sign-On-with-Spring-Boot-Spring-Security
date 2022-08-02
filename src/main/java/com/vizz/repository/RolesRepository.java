package com.vizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vizz.entity.Role;

@Repository
public interface RolesRepository extends JpaRepository<Role, Long>{
    
}
