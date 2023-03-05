package com.example.restapp.repository;

import com.example.restapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Integer> {

}
