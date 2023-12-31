package com.barnaclaebit.project.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_currency")
@Getter
@Setter
@EqualsAndHashCode
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cl_id")
    private long id;
    @Column(name = "cl_code")
    private String code;
    @Column(name = "cl_name")
    private String name;
    @Column(name = "cl_major_name")
    private String majorName;
    @Column(name = "cl_minor_name")
    private String minorName;
    @Column(name = "cl_cipher")
    private String cipher;
    @Column(name = "cl_minor_cipher")
    private String minorCipher;
    @Column(name = "cl_value")
    private BigDecimal value;



}
