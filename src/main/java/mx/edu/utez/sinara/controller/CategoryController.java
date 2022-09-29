package mx.edu.utez.sinara.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.sinara.entity.Category;
import mx.edu.utez.sinara.service.CategoryService;

@RestController
@RequestMapping(path = "/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping()
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @RequestMapping(value = "/save", method = { RequestMethod.GET, RequestMethod.POST })
    public Category save(@RequestBody Category obj) {
        return categoryService.save(obj);
    }

    @DeleteMapping(value = "/delete")
    public boolean delete(@RequestBody Category category) {
        try {
            boolean flag = false;
            flag = categoryService.delete(category);
            return flag ? true : false;

        } catch (Exception e) {
            return false;
        }
    }
}
