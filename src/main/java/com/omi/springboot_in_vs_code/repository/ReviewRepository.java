package com.omi.springboot_in_vs_code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omi.springboot_in_vs_code.model.Product;
import com.omi.springboot_in_vs_code.model.Review;
@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{
    List<Review> findByProduct(Product product);
}
