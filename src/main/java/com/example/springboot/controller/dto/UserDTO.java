package com.example.springboot.controller.dto;

import lombok.Data;

import java.util.List;


@Data
public class UserDTO {
    private String username;
    private String password;
    private String nickname;
    private String avatarUrl;
    private String token;
    private String salt;
    private String role;
//    private List<Menu> menus;

}
