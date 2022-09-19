package com.java.ft.technology.banking.services.responses.account.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdUserResponse {
    private Long userId;
    private String nationalityId;
    private String firstName;
    private String lastName;
    private String motherName;
    private String fatherName;
    private String email;
    private String phone;
    private String gender;
    private int statusId;

}
