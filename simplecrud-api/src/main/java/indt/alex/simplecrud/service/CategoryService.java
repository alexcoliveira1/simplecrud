package indt.alex.simplecrud.service;

import java.util.List;

import indt.alex.simplecrud.entity.Category;

public interface CategoryService {

    Category create(Category product);

    Category delete(int id);

    List<Category> findAll();

    Category findById(int id);
}

