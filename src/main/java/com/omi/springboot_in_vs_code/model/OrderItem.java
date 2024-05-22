package com.omi.springboot_in_vs_code.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderItemId;
    @ManyToOne
    @JoinColumn(name = "OrderId")
    private Orders order;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    private int quantity;
    private Double price;
}
