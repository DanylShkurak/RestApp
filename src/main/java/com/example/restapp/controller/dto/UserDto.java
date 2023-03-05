package com.example.restapp.controller.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private String name;
    private String surname;
    private int age;

    public UserDto(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}