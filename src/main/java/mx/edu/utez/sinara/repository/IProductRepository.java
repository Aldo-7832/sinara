package mx.edu.utez.sinara.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.sinara.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{
    
}
