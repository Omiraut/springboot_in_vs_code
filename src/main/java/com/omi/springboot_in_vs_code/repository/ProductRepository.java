package com.omi.springboot_in_vs_code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omi.springboot_in_vs_code.model.Catagory;
import com.omi.springboot_in_vs_code.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCatagory(Catagory catagory);

    List<Product> findByNameContaining(String name);

    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);

    List<Product> findByStock(int stock);
}
