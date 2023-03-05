package com.example.restapp.controller;

import com.example.restapp.controller.dto.UserDto;
import com.example.restapp.controller.mapper.UserMapper;
import com.example.restapp.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
   private UserService userService;
   private UserMapper userMapper;
   
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable int id){
        return ResponseEntity.ok(userMapper.toDto(userService.getById(id)));
    }
}
