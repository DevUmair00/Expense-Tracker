package com.umair.Backend.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequestDTO {

    @Email(message = "Invalid Email")
    @NotBlank(message = "Enail is Required")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;
}


















