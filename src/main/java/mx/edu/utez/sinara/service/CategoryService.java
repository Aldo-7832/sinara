package mx.edu.utez.sinara.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.sinara.entity.Category;
import mx.edu.utez.sinara.repository.ICategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Category> findAll() {
        try{
            return categoryRepository.findAll();
        }catch(Exception e){
            return null;
        }
    }

    public Category save(Category category){
        try{
            return categoryRepository.save(category);
        }catch(Exception e){
            return null;
        }
    }

    public boolean delete(Category category) {
        try {
            categoryRepository.delete(category);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
