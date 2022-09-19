package com.java.ft.technology.banking.repositories.account;

import com.java.ft.technology.banking.entities.concretes.account.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
