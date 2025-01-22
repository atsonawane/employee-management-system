package com.avinash.ems.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;
    @Column(unique = true, nullable = false)
    private String email;
    private String contactNumber;
    private String designation;
    private String department;
    private double salary;
    private Date joiningDate;

}
