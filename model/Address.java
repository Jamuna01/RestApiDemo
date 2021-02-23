package com.vastika.userinfosystem.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address_tbl")
@Data
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "country_name")
    private String countryName;
}
