package com.Guddu.ECommerceApp.controller;

import com.Guddu.ECommerceApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //Post

    @PostMapping("product")
    public String addAProduct(@RequestBody Product product)
    {
        return  productService.addAProduct(product);
    }

    @PostMapping("products")
    public String addListOfProducts(@RequestBody List<Product> products) {return productService.addListOfProducts(products);}


    @GetMapping("product/{Id}")
    public Optional<Product> getProduct(@PathVariable Integer Id)
    {
        return productService.getProduct(Id);
    }

    @GetMapping("products")
    public List<Product> getProducts()
    {
        return productService.getProducts();
    }
    @GetMapping("products/{category}")
    public List<Product> getProductsByCategory(@PathVariable ProductCategory category)
    {
        return productService.getProductsByCategory(category);
    }
    @DeleteMapping("product/{id}")
    public String deleteProductById(@PathVariable Integer id)
    {
        return productService.deleteProductById(id);
    }

}
