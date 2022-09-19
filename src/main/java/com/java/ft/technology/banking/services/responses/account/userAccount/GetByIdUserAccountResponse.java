package com.java.ft.technology.banking.services.responses.account.userAccount;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdUserAccountResponse {
    private Long customerAccountId;
    private Long customerId;
    private String accountNo;
    private String accountName;
    private Long productId;
    private String statusId;
    private String shortCode;
    private Double amount;
    private String unit;

}
