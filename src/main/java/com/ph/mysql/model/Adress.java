package com.ph.mysql.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PERSON_ADRESS")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    private String street;
    private String city;
    private String state;
    @ManyToOne
    @JoinColumn(name = "PERSON_ID")
    private Person person;

}
