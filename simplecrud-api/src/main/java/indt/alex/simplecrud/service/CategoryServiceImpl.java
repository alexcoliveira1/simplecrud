package indt.alex.simplecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indt.alex.simplecrud.entity.Category;
import indt.alex.simplecrud.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public Category create(Category category) {
        return repository.save(category);
    }

    @Override
    public Category delete(int id) {
    	Category category = findById(id);
        if(category != null){
            repository.delete(category);
        }
        return category;
    }

    @Override
    public List<Category> findAll() {
    	List<Category> ps = repository.findAll();
        return ps;
    }

    @Override
    public Category findById(int id) {
        return repository.findOne(id);
    }
}