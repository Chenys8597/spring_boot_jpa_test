package com.example.spring_boot_jpa_test.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_test")
@Data
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer"})
public class Test {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "t_id")
    private Integer id;

    @Column(name = "t_test")
    private String test;

    public Test() { }

    public Test(String test) {
        this.test = test;
    }


}
