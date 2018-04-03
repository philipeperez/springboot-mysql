package com.ph.mysql.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    private Long id;

    @NotBlank
    @Column(name = "USERNAME", unique = true, nullable = false)
    private String userName;

    @NotBlank
    @Column(name = "PASSWORD")
    private String password;

    @OneToOne(cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    private Person person;

}
