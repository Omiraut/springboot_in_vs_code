package com.omi.springboot_in_vs_code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omi.springboot_in_vs_code.model.OrderCoupon;
import com.omi.springboot_in_vs_code.model.Orders;

public interface OrderCouponRepository extends JpaRepository<OrderCoupon, Long> {
    List<OrderCoupon> findByOrder(Orders order);
}
