package com.example.back.office.officeLicenses.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "license")
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    @NotNull
    private String name;
    @NotNull
    private Integer capacity;
    @NotNull
    private Boolean full;
    @NotNull
    private Boolean project;
    @NotNull
    private String password;

  //  private List<User> users;

}
