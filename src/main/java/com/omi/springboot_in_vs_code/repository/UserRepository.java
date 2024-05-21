package com.omi.springboot_in_vs_code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omi.springboot_in_vs_code.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
