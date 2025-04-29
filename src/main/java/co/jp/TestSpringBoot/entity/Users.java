package co.jp.TestSpringBoot.entity;

import lombok.Data;

@Data
public class Users {
    private Integer id;
    private String name;
    private String email;
    private String username;
    private String password;
}