package com.omi.springboot_in_vs_code.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long productId;
    private String name;
    private Double price;
    private int stock;
    private String categoryName;
    // Getters and Setters
}
