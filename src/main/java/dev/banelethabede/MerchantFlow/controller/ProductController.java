package dev.banelethabede.MerchantFlow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.banelethabede.MerchantFlow.model.Product;
import dev.banelethabede.MerchantFlow.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public boolean addProduct(@RequestBody Product product) {
        System.out.println("received :" + product);
        return service.addproduct(product);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public boolean deleteProductById(@PathVariable int id) {
        return service.removeProductById(id);
    }

}
