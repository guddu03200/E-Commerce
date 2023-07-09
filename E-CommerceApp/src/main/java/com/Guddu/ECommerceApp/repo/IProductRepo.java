package com.Guddu.ECommerceApp.repo;

import com.Guddu.ECommerceApp.model.ProductModel;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<ProductModel, Integer> {
    List<Product> findByProductCategory(ProductCategory category);
}
