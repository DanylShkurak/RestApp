package com.example.restapp.controller;
import com.example.restapp.entity.User;
import com.example.restapp.repository.UserRepository;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class UserControllerTest {
    @Autowired
    private WebTestClient webClient;
    @Autowired
    UserRepository userRepository;


    @Test
    void getById() {
                User userById = userRepository.getById(2);
                Integer id = userById.getId();
                webClient.get()
                        .uri("/users/{id}",id)
                        .exchange()
                        .expectStatus().isOk()
                        .expectBody(User.class)
                ;
            }


        }

