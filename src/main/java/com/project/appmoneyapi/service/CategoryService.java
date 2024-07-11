package com.project.appmoneyapi.service;

import com.project.appmoneyapi.dto.CategoryDTO;
import com.project.appmoneyapi.model.Category;
import com.project.appmoneyapi.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Transactional
    public List<CategoryDTO> findAll(){
        List<Category> result = categoryRepository.findAll();

        return result.stream().map(x -> new CategoryDTO(x)).toList();
    }
}
