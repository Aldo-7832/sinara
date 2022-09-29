package mx.edu.utez.sinara.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.sinara.entity.Category;

public interface ICategoryRepository  extends JpaRepository<Category, Long>{
    
}
