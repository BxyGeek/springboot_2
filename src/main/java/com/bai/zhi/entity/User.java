package com.bai.zhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * @author bxy
 */
@Table(name = "t_user")
public class User {
    @Id
    private String id;
    @Column(name = "username")
    private String userName;

    private String password;

    private Integer age;

}