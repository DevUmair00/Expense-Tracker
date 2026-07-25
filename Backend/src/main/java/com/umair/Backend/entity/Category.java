package com.umair.Backend.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "categories")
@NoArgsConstructor
@AllArgsConstructor

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private  Long id;

    @NotBlank(message = "Name is Required")
    @Column(name = "category_name" , nullable = false)
    private String name;

    @NotBlank(message = "Icon is Required")
    @Column(name = "category_icon")
    private String icon;

    @NotBlank(message = "Color is Required")
    @Column(name = "category_color")
    private String color;

    @ManyToOne
    @JoinColumn(name = "user_id" , nullable = false)
    private User user;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Transaction> transactions;
}
