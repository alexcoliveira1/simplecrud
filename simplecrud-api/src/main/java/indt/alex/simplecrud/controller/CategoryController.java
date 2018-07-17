package indt.alex.simplecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import indt.alex.simplecrud.entity.Category;
import indt.alex.simplecrud.service.CategoryService;

@RestController
@RequestMapping({"/apiCategory"})
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category create(@RequestBody Category category){
        return categoryService.create(category);
    }

    @GetMapping(path = {"/{id}"})
    public Category findOne(@PathVariable("id") int id){
        return categoryService.findById(id);
    }

    @DeleteMapping(path ={"/{id}"})
    public Category delete(@PathVariable("id") int id) {
        return categoryService.delete(id);
    }

    @GetMapping
    public List<Category> findAll(){
        return categoryService.findAll();
    }
}