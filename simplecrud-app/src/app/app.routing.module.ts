import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ProductComponent } from './product/product.component';
import {AddProductComponent} from './product/add-product.component';
import {AddCategoryComponent} from './category/add-category.component';
import { CategoryComponent } from './category/category.component';

const routes: Routes = [
  { path: 'products', component: ProductComponent },
  { path: 'add', component: AddProductComponent },
  { path: 'category', component: CategoryComponent },
  { path: 'addCategory', component: AddCategoryComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
