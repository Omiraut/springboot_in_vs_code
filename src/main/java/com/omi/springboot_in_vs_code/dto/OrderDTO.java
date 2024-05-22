package com.omi.springboot_in_vs_code.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class OrderDTO {
    private Long orderId;
    private String username;
    private LocalDateTime orderDate;
    private String status;
    private List<OrderItemDTO> items;
    // Getters and Setters
}
