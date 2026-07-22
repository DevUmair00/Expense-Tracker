package com.umair.Backend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transactions")
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private  Long id;

    @Column(name = "transaction_title" , nullable = false)
    private String title;

    @Column(name = "transaction_amount" , nullable = false)
    private BigDecimal amount;

    @Column(name = "transaction_type"  , nullable = false)
    private String type;

    @Column(name = "transaction_date" , nullable = false)
    private LocalDate date;

    @Column(name = "transaction_note")
    @Lob
    private String note;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
