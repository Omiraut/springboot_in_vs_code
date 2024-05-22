package com.omi.springboot_in_vs_code.dto;

import lombok.Data;

@Data
public class OrderItemDTO {
    private Long orderItemId;
    private String productName;
    private int quantity;
    private Double price;
    // Getters and Setters
}
