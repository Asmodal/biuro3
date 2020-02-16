package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByMail(String mail);
}
