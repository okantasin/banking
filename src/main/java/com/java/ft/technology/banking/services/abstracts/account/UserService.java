package com.java.ft.technology.banking.services.abstracts.account;

import com.java.ft.technology.banking.common.utilities.models.ApiResponse;
import com.java.ft.technology.banking.entities.concretes.account.User;
import com.java.ft.technology.banking.services.requests.account.user.CreateUserRequest;
import com.java.ft.technology.banking.services.responses.account.user.GetAllUserResponse;

import java.util.List;

public interface UserService {
    ApiResponse<List<GetAllUserResponse>> getAllUsers();

    ApiResponse<User> createUserRequest(CreateUserRequest createUserRequest);
}
