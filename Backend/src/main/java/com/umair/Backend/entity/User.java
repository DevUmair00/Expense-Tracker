package com.umair.Backend.entity;

import jakarta.persistence.*;
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

    @Column(name = "user_name" , nullable = false)
    private String name;

    @Column(name = "user_email" , nullable = false , unique = true)
    private String email;

    @Column(name = "user_password" , nullable = false)
    private String password;

    @CreationTimestamp
    @Column(name = "user_created_at", nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Category> categories;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;
}
