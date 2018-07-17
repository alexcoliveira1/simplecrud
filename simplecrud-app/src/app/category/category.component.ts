import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Category } from '../models/category.model';
import { CategoryService } from './category.service';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styles: []
})
export class CategoryComponent implements OnInit {

  categories: Category[];

  constructor(private router: Router, private categoryService: CategoryService) {

  }

  ngOnInit() {
    this.categoryService.getCategories()
      .subscribe( data => {
        this.categories = data;
      });
  };

  deleteCategory(category: Category): void {
    this.categoryService.deleteCategory(category)
      .subscribe( data => {
        this.categories = this.categories.filter(u => u !== category);
      })
  };

}


