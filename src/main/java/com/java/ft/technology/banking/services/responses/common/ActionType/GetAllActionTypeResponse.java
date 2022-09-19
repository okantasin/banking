package com.java.ft.technology.banking.services.responses.common.ActionType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllActionTypeResponse {
    private String name;
    private String description;

}
