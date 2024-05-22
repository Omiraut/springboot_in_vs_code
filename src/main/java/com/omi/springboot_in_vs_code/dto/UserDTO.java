package com.omi.springboot_in_vs_code.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long userId;
    private String username;
    private String password;
}
