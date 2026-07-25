package com.umair.Backend.service;

import com.umair.Backend.entity.Transaction;
import com.umair.Backend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepo;

    public Transaction createTransaction(Transaction transaction)
    {
        return transactionRepo.save(transaction);
    }

    public  Transaction getTransactionById(Long id)
    {
        return transactionRepo.findById(id).orElse(null);
    }

    public List<Transaction> getAllTransaction()
    {
        return transactionRepo.findAll();
    }

    public void deleteTransaction(Long id)
    {
        transactionRepo.deleteById(id);
    }

    public Transaction updateTransaction(Long id , Transaction transaction)
    {
        Transaction temp = transactionRepo.findById(id).orElse(null);

        if (temp != null)
        {
            temp.setTitle(transaction.getTitle());
            temp.setAmount(transaction.getAmount());
            temp.setDate(transaction.getDate());
            temp.setNote(transaction.getNote());
            temp.setType(transaction.getType());

            temp.setUser(transaction.getUser());
            temp.setCategory(transaction.getCategory());

            return transactionRepo.save(temp);
        }

        return null;
    }

    public List<Transaction> getTransactionsByUserId(Long userId)
    {
        return transactionRepo.findByUserId(userId);
    }


    public List<Transaction> getTransactionByCategoryId(Long categoryId){ return  transactionRepo.findByCategoryId(categoryId); }

    public List<Transaction> getTransactionByType(String type){ return transactionRepo.findByType(type); }

    public List<Transaction> getTransactionByUserIdAndType(Long userId, String type ){ return transactionRepo.findByUserIdAndType(userId , type);  }

    public List<Transaction> getTransactionByTitleContaining(String word){ return transactionRepo.findByTitleContaining(word);  }

    public List<Transaction> getTransactionByAmountGreaterThan(BigDecimal amount){ return  transactionRepo.findByAmountGreaterThan(amount); }
}
