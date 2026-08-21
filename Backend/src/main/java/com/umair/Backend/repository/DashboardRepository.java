package com.umair.Backend.repository;

import com.umair.Backend.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;

public interface DashboardRepository extends JpaRepository<Transaction, Long> {

    @Query("""
        SELECT COALESCE(SUM(t.amount), 0)
        FROM Transaction t
        WHERE t.user.id = :userId
        AND t.type = 'INCOME'
    """)

    BigDecimal getTotalIncome(@Param("userId") Long userId);


    @Query("""
        SELECT COALESCE(SUM(t.amount), 0)
        FROM Transaction t
        WHERE t.user.id = :userId
        AND t.type = 'EXPENSE'
    """)

    BigDecimal getTotalExpense(@Param("userId") Long userId );


    @Query("""
        SELECT COUNT(t)
        FROM Transaction t
        WHERE t.user.id = :userId         
        """)

    Long getTransactionCount(@Param("userId") Long userId);



}
