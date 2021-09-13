package com.dp.data.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Table(name = "t_user")
public class TUser {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    private String name;

    private String email;

    private String password;

}