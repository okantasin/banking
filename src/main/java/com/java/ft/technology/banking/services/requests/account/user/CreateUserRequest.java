package com.java.ft.technology.banking.services.requests.account.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
    private String userName;
    private String password;
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
