package com.omi.springboot_in_vs_code.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.omi.springboot_in_vs_code.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsernameAndPassword(String username, String password);

    Optional<Users> findByUsername(String username);

    @Modifying
    @Query("UPDATE Users u SET u.active = false WHERE u.userId = :userId")
    void deactivateUser(@Param("userId") Long userId);
}
