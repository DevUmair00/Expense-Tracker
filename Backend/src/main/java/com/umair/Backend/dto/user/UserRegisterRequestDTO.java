package com.umair.Backend.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterRequestDTO {

    @NotBlank(message = "Name is Required")
    private String  name;

    @Email(message = "Invalid Email Format")
    @NotBlank(message = "Email is Required")
    private String email;

    @Size(min = 6, message = "Password must contain at least 6 characters")
    @NotBlank(message = "Password is required")
    private String password;
}
