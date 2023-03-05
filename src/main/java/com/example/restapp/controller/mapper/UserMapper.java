package com.example.restapp.controller.mapper;

import com.example.restapp.entity.User;
import com.example.restapp.controller.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toDto(User user){
        return new UserDto(
                user.getName(),
                user.getSurname(),
                user.getAge()
        );
    }

}
