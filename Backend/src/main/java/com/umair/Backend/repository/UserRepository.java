package com.umair.Backend.repository;

import com.umair.Backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{


    User findByEmail(String email);

    List<User> findByNameContaining(String name);

    boolean existsByEmail(String email);

}
