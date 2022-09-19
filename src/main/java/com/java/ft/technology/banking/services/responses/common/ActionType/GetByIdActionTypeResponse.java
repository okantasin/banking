package com.java.ft.technology.banking.services.responses.common.ActionType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdActionTypeResponse {
    private Long actionTypeId;
    private String name;
    private String description;
}
