package indt.alex.simplecrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import indt.alex.simplecrud.entity.Product;
import indt.alex.simplecrud.service.ProductService;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product){
    	System.out.println(product.getCategory().getName());
        return productService.create(product);
    }

    @GetMapping(path = {"/{id}"})
    public Product findOne(@PathVariable("id") int id){
        return productService.findById(id);
    }

    @DeleteMapping(path ={"/{id}"})
    public Product delete(@PathVariable("id") int id) {
        return productService.delete(id);
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }
}
