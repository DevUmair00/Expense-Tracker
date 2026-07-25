package com.umair.Backend.controller;

import com.umair.Backend.entity.Category;
import com.umair.Backend.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category createCategory(@Valid @RequestBody Category category)
    {
        return categoryService.createCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id)
    {
        categoryService.deleteCategory(id);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id , @Valid @RequestBody Category category)
    {
        return categoryService.updateCategory(id , category);
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id)
    {
        return  categoryService.getCategoryById(id);
    }

    @GetMapping
    public List<Category> getAllCategories()
    {
        return categoryService.getAllCategories();
    }


    @GetMapping("/user/{userId}")
    public List<Category> getCategoriesByUserId(@PathVariable Long userId)
    {
        return categoryService.getCategoriesByUserId(userId);
    }

    @GetMapping("/name/{name}")
    public Category getCategoryByName(@PathVariable String name)
    {
        return categoryService.getCategoryByName(name);
    }

    @GetMapping("/search")
    public List<Category> searchCategory(@RequestParam String name)
    {
        return categoryService.searchCategory(name);
    }
}
