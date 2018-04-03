package com.ph.mysql.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "PERSON")
//@JsonIgnoreProperties({"adressSet"})
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotBlank
    @Column(name = "NAME")
    private String name;

    @NotNull
    @Column(name = "AGE")
    private Integer age;

//    @Column(name = "ADRESS_ID")
//    @OneToMany(mappedBy = "person", fetch = FetchType.EAGER)
//    private List<Adress> adressSet;

}
