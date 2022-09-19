package com.java.ft.technology.banking.controllers.account;

import com.java.ft.technology.banking.services.abstracts.account.UserService;
import com.java.ft.technology.banking.services.requests.account.user.CreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        var response = userService.getAllUsers();
        return ResponseEntity.status(response.getHttpStatus())
                .body(response);

    }

    @PostMapping
    public ResponseEntity<?> createUserRequest(@RequestBody CreateUserRequest createUserRequest){
        var response= userService.createUserRequest(createUserRequest);
        return ResponseEntity
                .status(response.getHttpStatus())
                .body(response);
    }
}
