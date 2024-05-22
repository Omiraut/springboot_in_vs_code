package com.omi.springboot_in_vs_code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omi.springboot_in_vs_code.model.Users;
import com.omi.springboot_in_vs_code.model.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
    List<Wishlist> findByUser(Users user);
}
