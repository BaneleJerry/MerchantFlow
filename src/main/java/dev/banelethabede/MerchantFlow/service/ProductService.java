package dev.banelethabede.MerchantFlow.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.banelethabede.MerchantFlow.model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(2, "Mayo", 5.00)));

    public List<Product> getProducts() {
        return this.products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst().orElse(null);
    }

    public boolean removeProductById(int id) {
        return products.removeIf(p -> p.getId() == id);

    }

    public boolean addproduct(Product product) {
        if (products.stream().noneMatch(p -> p.getId() == product.getId())) {
            products.add(product);
            return true;
        }
        return false;
    }

    public Product updateProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                return product;
            }
        }
        return null;

    }
}
