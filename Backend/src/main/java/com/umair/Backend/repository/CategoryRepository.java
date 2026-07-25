package com.umair.Backend.repository;

import com.umair.Backend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByUserId(Long userId);

    Category findByName(String name);

    List<Category> findByNameContaining(String name);

}
