package com.umair.Backend.repository;

import com.umair.Backend.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByUserId(Long userId);

    List<Transaction> findByCategoryId(Long categoryId);

    List<Transaction> findByType(String type);

    List<Transaction> findByUserIdAndType(Long userId, String type );

    List<Transaction> findByTitleContaining(String word);

    List<Transaction> findByAmountGreaterThan(BigDecimal amount);

}
