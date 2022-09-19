package com.java.ft.technology.banking.repositories.exchange;

import com.java.ft.technology.banking.entities.concretes.exchange.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Long> {
}

