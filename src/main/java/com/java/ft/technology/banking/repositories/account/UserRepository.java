package com.java.ft.technology.banking.repositories.account;

import com.java.ft.technology.banking.entities.concretes.account.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

}

