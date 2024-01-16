package com.example.back.office.formExpress.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Available")
    private Boolean isAvailable;

    @Column(name = "Name")
    private String name;

    @Column(name = "Date")
    private Date date;

    @Max(value = 36, message = "The capacity can't be grater than 36")
    @Column(name = "Capacity")
    private Integer capacity;

    @Column(name = "Registered")
    private Integer registered;

}
