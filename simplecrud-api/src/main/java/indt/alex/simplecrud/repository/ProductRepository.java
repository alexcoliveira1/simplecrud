package indt.alex.simplecrud.repository;

import org.springframework.data.repository.Repository;

import indt.alex.simplecrud.entity.Product;

import java.util.List;

public interface ProductRepository extends Repository<Product, Integer> {
    void delete(Product product);

    List<Product> findAll();

    Product findOne(int id);

    Product save(Product product);
}