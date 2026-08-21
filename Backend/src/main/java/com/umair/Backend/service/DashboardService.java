package com.umair.Backend.service;

import com.umair.Backend.dto.DashboardResponse;
import com.umair.Backend.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DashboardService {

    @Autowired
    private DashboardRepository dashboardRepo;

    public DashboardResponse getDashboard(Long userId)
    {

        BigDecimal totalIncome = dashboardRepo.getTotalIncome(userId);
        BigDecimal totalExpense = dashboardRepo.getTotalExpense(userId);
        Long transactionCount = dashboardRepo.getTransactionCount(userId);
        BigDecimal balance = totalIncome.subtract(totalExpense);

        return new DashboardResponse(
                totalIncome,
                totalExpense,
                balance,
                transactionCount
        );
    }
}
