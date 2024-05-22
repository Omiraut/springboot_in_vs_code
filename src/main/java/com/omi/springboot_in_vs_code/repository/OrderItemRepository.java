package com.omi.springboot_in_vs_code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omi.springboot_in_vs_code.model.OrderItem;
import com.omi.springboot_in_vs_code.model.Orders;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrder(Orders order);
}
