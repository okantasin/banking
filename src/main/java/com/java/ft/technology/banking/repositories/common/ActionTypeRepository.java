package com.java.ft.technology.banking.repositories.common;

import com.java.ft.technology.banking.entities.concretes.common.ActionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionTypeRepository extends JpaRepository<ActionType, Long> {
}
