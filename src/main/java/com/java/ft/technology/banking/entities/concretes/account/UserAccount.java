package com.java.ft.technology.banking.entities.concretes.account;

import com.java.ft.technology.banking.entities.concretes.exchange.UserAccountType;
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
@Table(name = "USER_ACCOUNT")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ACCOUNT_ID")
    private Long userAccountId;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "USER_ACCOUNT_TYPE_ID")
    private UserAccountType userAccountType;

    @Column(name = "ACCOUNT_NO")
    private String accountNo;

    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    @Column(name = "STATUS_ID")
    private String statusId;

    @Column(name = "AMOUNT")
    private Double amount;
}
