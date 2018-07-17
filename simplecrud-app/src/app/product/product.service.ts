import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Product } from '../models/product.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class ProductService {

  constructor(private http:HttpClient) {}

  //private productUrl = 'http://localhost:8080/simplecrud/product';
  private productUrl = '/api';

  public getProducts() {
    return this.http.get<Product[]>(this.productUrl);
  }

  public deleteProduct(product) {
    return this.http.delete(this.productUrl + "/"+ product.id);
  }

  public createProduct(product) {
    console.log('createProduct', product);
    return this.http.post<Product>(this.productUrl, product);
  }

}
