package com.omi.springboot_in_vs_code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omi.springboot_in_vs_code.model.Wishlist;
import com.omi.springboot_in_vs_code.model.WishlistItem;

public interface WishlistItemRepository extends JpaRepository<WishlistItem, Long> {
    List<WishlistItem> findByWishlist(Wishlist wishlist);
}
