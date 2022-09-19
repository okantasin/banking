package com.java.ft.technology.banking.repositories.exchange;

import com.java.ft.technology.banking.entities.concretes.exchange.UserAccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerAccountTypeRepository extends JpaRepository<UserAccountType, Long> {
}
