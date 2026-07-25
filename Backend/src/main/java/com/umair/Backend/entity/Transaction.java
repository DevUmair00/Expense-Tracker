package com.umair.Backend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.DecimalMin;

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

    @NotBlank(message = "Title is required")
    @Column(name = "transaction_title" , nullable = false)
    private String title;

    @NotNull(message = "Amount is required")
    @DecimalMin(value = "0.01", message = "Amount must be greater than 0")
    @Column(name = "transaction_amount" , nullable = false)
    private BigDecimal amount;

    @NotBlank(message = "Type is required")
    @Column(name = "transaction_type"  , nullable = false)
    private String type;

    @NotNull(message = "Date is required")
    @Column(name = "transaction_date" , nullable = false)
    private LocalDate date;

    @Column(name = "transaction_note")
    @Lob
    private String note;


    @NotNull(message = "User is required")
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotNull(message = "Category is required")
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
