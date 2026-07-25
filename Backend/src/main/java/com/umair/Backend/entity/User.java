package com.umair.Backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @NotBlank(message = "Name is Required")
    @Column(name = "user_name" , nullable = false)
    private String name;

    @NotBlank(message = "Email is Required")
    @Email(message = "Please Enter a Valid Email")
    @Column(name = "user_email" , nullable = false , unique = true)
    private String email;

    @NotBlank(message = "Password is Required")
    @Size(min = 6 , message = "Password Must be at least 6 Character Long")
    @Column(name = "user_password" , nullable = false)
    private String password;

    @CreationTimestamp
    @Column(name = "user_created_at", nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Category> categories;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Transaction> transactions;
}
