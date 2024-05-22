package com.omi.springboot_in_vs_code.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wishlist_id;
    @ManyToOne
    @JoinColumn(name = "UserId")
    private Users user;
    @ManyToMany
    @JoinTable(name = "wishlist_products", joinColumns = @JoinColumn(name = "wishlistId"), inverseJoinColumns = @JoinColumn(name = "productId"))
    private List<Product> products;
}
