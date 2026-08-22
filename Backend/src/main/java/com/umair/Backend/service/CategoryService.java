package com.umair.Backend.service;

import com.umair.Backend.entity.Category;
import com.umair.Backend.exception.ResourceNotFoundException;
import com.umair.Backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    public Category createCategory(Category category){ return categoryRepo.save(category); }

    public void deleteCategory(Long id)
    {
        Category category = categoryRepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException(
                        "Category not found with id " + id
                )
        );
        categoryRepo.delete(category);
    }

    public Category updateCategory(Long id , Category category)
    {
        Category temp = categoryRepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException(
                        "Category Not found with id " + id
                )
        );

        temp.setName(category.getName());
        temp.setIcon(category.getIcon());
        temp.setColor(category.getColor());

        return categoryRepo.save(temp);
    }

    public Category getCategoryById(Long id)
    {
        return categoryRepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException(
                        "Category Not Found with id : " + id
                ));
    }

    public List<Category> getAllCategories()
    {
        return categoryRepo.findAll();

    }

    public List<Category> getCategoriesByUserId(Long userId)
    {

        return categoryRepo.findByUserId(userId);
    }

    public Category getCategoryByName(String name)
    {
        return categoryRepo.findByName(name);
    }

    public List<Category> searchCategory(String name)
    {
        return categoryRepo.findByNameContaining(name);
    }

}
