package indt.alex.simplecrud.service;

import java.util.List;

import indt.alex.simplecrud.entity.Product;

public interface ProductService {

    Product create(Product product);

    Product delete(int id);

    List<Product> findAll();

    Product findById(int id);
}
