package com.omi.springboot_in_vs_code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omi.springboot_in_vs_code.model.Orders;
import com.omi.springboot_in_vs_code.model.Users;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
    List<Orders> findByUser(Users user);

    List<Orders> findByStatus(String Status);
}
