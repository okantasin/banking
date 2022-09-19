package com.java.ft.technology.banking.services.concretes.account;

import com.java.ft.technology.banking.common.utilities.models.ApiResponse;
import com.java.ft.technology.banking.entities.concretes.account.User;
import com.java.ft.technology.banking.repositories.account.UserRepository;
import com.java.ft.technology.banking.services.abstracts.account.UserService;
import com.java.ft.technology.banking.services.requests.account.user.CreateUserRequest;
import com.java.ft.technology.banking.services.responses.account.user.GetAllUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {

    private final UserRepository userRepository;

    @Override
    public ApiResponse<List<GetAllUserResponse>> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<GetAllUserResponse> responses = users.stream()
                .map(user -> GetAllUserResponse.builder()
                        .userId(user.getUserId())
                        .userName(user.getUserName())
                        .build()).collect(Collectors.toList());
        return ApiResponse.default_OK(responses);
    }

    @Override
    public ApiResponse<User> createUserRequest(CreateUserRequest createUserRequest) {
        User user = User.builder()
                .nationalityId(createUserRequest.getNationalityId())
                .userName(createUserRequest.getUserName())
                .password(createUserRequest.getPassword())
                .firstName(createUserRequest.getFirstName())
                .lastName(createUserRequest.getLastName())
                .motherName(createUserRequest.getMotherName())
                .fatherName(createUserRequest.getFatherName())
                .email(createUserRequest.getEmail())
                .phone(createUserRequest.getPhone())
                .gender(createUserRequest.getGender())
                .statusId(createUserRequest.getStatusId())
                .build();
        this.userRepository.save(user);
        return ApiResponse.default_ACCEPTED(user);

    }
}


