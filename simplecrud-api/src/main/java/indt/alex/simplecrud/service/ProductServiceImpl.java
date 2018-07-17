package indt.alex.simplecrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indt.alex.simplecrud.entity.Category;
import indt.alex.simplecrud.entity.Product;
import indt.alex.simplecrud.repository.CategoryRepository;
import indt.alex.simplecrud.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;
    
    @Autowired
    private CategoryRepository catRepository;

    @Override
    public Product create(Product product) {
    	Category cat = catRepository.findByName(product.getCategory().getName());
    	product.setCategory(cat);
        return repository.save(product);
    }

    @Override
    public Product delete(int id) {
        Product product = findById(id);
        if(product != null){
            repository.delete(product);
        }
        return product;
    }

    @Override
    public List<Product> findAll() {
    	List<Product> ps = repository.findAll();
        return ps;
    }

    @Override
    public Product findById(int id) {
        return repository.findOne(id);
    }
}
