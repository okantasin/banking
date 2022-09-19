package com.java.ft.technology.banking.entities.concretes.exchange;

import com.java.ft.technology.banking.entities.concretes.account.UserAccount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "USER_ACCOUNT_TYPE")
public class UserAccountType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ACCOUNT_TYPE_ID")
    private Long userAccountTypeId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "UNIT")
    private String unit;

    @Column(name = "SHORT_CODE")
    private String shortCode;

    @OneToMany(mappedBy = "userAccountType")
    private List<UserAccount> userAccounts;
}
