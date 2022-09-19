package com.java.ft.technology.banking.services.responses.exchange.transactionHistory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdTransactionHistoryResponse {
    private Long transactionHistoryId;
    private Long productId;
    private String action;
    private String description;
    private Double amount;
}
