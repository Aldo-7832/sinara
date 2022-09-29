package mx.edu.utez.sinara.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.sinara.entity.Product;
import mx.edu.utez.sinara.service.ProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> findAll() {
        return productService.findAll();
    }

    @RequestMapping(value = "/save", method = { RequestMethod.GET, RequestMethod.POST })
    public Product save(@RequestBody Product obj) {
        return productService.save(obj);
    }

    @DeleteMapping(value = "/delete")
    public boolean delete(@RequestBody Product product) {
        try {
            boolean flag = false;
            flag = productService.delete(product);
            return flag ? true : false;

        } catch (Exception e) {
            return false;
        }
    }
}
