package indt.alex.simplecrud.repository;

import org.springframework.data.repository.Repository;

import indt.alex.simplecrud.entity.Category;

import java.util.List;

public interface CategoryRepository extends Repository<Category, Integer> {
    void delete(Category product);

    List<Category> findAll();

    Category findOne(int id);
    
    Category findByName(String name);

    Category save(Category category);
}