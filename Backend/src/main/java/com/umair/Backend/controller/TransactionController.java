package com.umair.Backend.controller;

import com.umair.Backend.entity.Transaction;
import com.umair.Backend.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction createTransaction(@Valid @RequestBody Transaction transaction)
    {
        return transactionService.createTransaction(transaction);
    }

    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable Long id)
    {
        return transactionService.getTransactionById(id);
    }

    @GetMapping
    public List<Transaction> getAllTransactions()
    {
        return transactionService.getAllTransaction();
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id)
    {
        transactionService.deleteTransaction(id);
    }

    @PutMapping("/{id}")
    public Transaction updateTransaction(@PathVariable Long id , @Valid @RequestBody Transaction transaction)
    {
        return transactionService.updateTransaction(id , transaction);
    }
}
