package com.umair.Backend.service;

import com.umair.Backend.entity.Category;
import com.umair.Backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    public Category createCategory(Category category){ return categoryRepo.save(category); }

    public void deleteCategory(Long id){ categoryRepo.deleteById(id); }

    public Category updateCategory(Long id , Category category)
    {
        Category temp = categoryRepo.findById(id).orElse(null);

        if(temp != null)
        {
            temp.setName(category.getName());
            temp.setIcon(category.getIcon());
            temp.setColor(category.getColor());

            return categoryRepo.save(temp);
        }

        return  null;
    }

    public Category getCategoryById(Long id){ return categoryRepo.findById(id).orElse(null);}

    public List<Category> getAllCategories()
    {
        return categoryRepo.findAll();
    }
}
