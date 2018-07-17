package indt.alex.simplecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import indt.alex.simplecrud.entity.Category;
import indt.alex.simplecrud.repository.CategoryRepository;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SimpleCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCrudApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner demo(CategoryRepository repository) {
//		return (args) -> {
//			// save a couple of customers
//			Category cat = new Category();
//			cat.setId(1);
//			cat.setName("Cat");
//			repository.save(cat);
//		};
//	}
}