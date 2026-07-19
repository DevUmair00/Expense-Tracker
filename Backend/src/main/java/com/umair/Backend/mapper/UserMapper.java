package com.umair.Backend.mapper;

import com.umair.Backend.dto.user.UserRegisterRequestDTO;
import com.umair.Backend.dto.user.UserResponseDTO;
import com.umair.Backend.entity.User;

public class UserMapper {


    //Entity To DTO
    public static UserResponseDTO Entity_To_DTO(User user)
    {
        UserResponseDTO dto = new UserResponseDTO();

        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());

        return dto;
    }

    //DTO To Entity
    public static User DTO_TO_Entity(UserRegisterRequestDTO dto)
    {
        User user = new User();

        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        return user;
    }

}






















