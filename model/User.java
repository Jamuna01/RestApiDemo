package com.vastika.userinfosystem.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_tbl")
@Data
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_name")
    private String username;

    private String password;

    private String gender;

    private String nationality;

    private String hobbies;

    @Column(name = "mobile_no")
    private long mobileNo;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    private String email;
    private String comments;

    //@OneToOne(cascade = CascadeType.MERGE)
    //private Role role;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}
