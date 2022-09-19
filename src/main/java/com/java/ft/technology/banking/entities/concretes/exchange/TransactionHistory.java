package com.java.ft.technology.banking.entities.concretes.exchange;

import com.java.ft.technology.banking.entities.concretes.account.UserAccount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "TRANSACTION_HISTORY")
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_HISTORY_ID")
    private Long transactionHistoryId;

    @ManyToOne
    @JoinColumn(name = "USER_ACCOUNT_ID")
    private UserAccount userAccount;

    @Column(name="ACTION")
    private String action;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="AMOUNT")
    private Double amount;

}

