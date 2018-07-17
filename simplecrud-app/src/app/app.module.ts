import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { AppRoutingModule } from './app.routing.module';
import {ProductService} from './product/product.service';
import {CategoryService} from './category/category.service';
import {HttpClientModule} from "@angular/common/http";
import {AddProductComponent} from './product/add-product.component';
import {CategoryComponent} from './category/category.component';
import {AddCategoryComponent} from './category/add-category.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    AddProductComponent,
    CategoryComponent,
    AddCategoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    ProductService,
    CategoryService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
