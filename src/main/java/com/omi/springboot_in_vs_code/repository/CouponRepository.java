package com.omi.springboot_in_vs_code.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omi.springboot_in_vs_code.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
    Optional<Coupon> findByCode(String code);
}
