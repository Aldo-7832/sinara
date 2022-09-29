package mx.edu.utez.sinara.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.sinara.entity.Product;
import mx.edu.utez.sinara.repository.IProductRepository;


@Service
public class ProductService {
    @Autowired
    private IProductRepository productRepository;

    public List<Product> findAll() {
        try{
            return productRepository.findAll();
        }catch(Exception e){
            return null;
        }
    }

    public Product save(Product product){
        try{
            return productRepository.save(product);
        }catch(Exception e){
            return null;
        }
    }

    public boolean delete(Product product) {
        try {
            productRepository.delete(product);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
