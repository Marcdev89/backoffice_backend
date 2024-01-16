package com.example.back.office.idneoLicences.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "LicencesUsageUsers")
public class UserActive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "LicenseName")
    private String license;
    @Column(name = "UserCode")
    private String code;
    @Column(name = "DateConnected")
    private String date;
    @Column(name = "UserName")
    private String name;

}
