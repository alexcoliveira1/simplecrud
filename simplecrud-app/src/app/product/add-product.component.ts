import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Product } from '../models/product.model';
import { Category } from '../models/category.model';
import { ProductService } from './product.service';
import { CategoryService } from '../category/category.service';

@Component({
  templateUrl: './add-product.component.html'
})
export class AddProductComponent {

  product: Product = new Product();
  category: Category = new Category();
  categories: Category[] = new Array<Category>();

  constructor(private router: Router, private productService: ProductService, private categoryService: CategoryService) {
    this.categoryService.getCategories()
        .subscribe( data => {
          this.categories = data;
          console.log(data);
        });
  }

  createProduct(): void {
    this.product.category = {id: undefined, name: ''};
    this.product.category.name = this.category.name;
    this.productService.createProduct(this.product)
        .subscribe( data => {
          alert("Product created successfully.");
        });
  };

}
