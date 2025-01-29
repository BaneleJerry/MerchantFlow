package dev.banelethabede.MerchantFlow.config;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dev.banelethabede.MerchantFlow.model.Product;
import dev.banelethabede.MerchantFlow.repository.ProductRepository;

@Component
public class ProductSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository repo;

    @Override
    public void run(String... args) throws Exception {
        if (repo.count() == 0) {
            byte[] image = Files.readAllBytes(Paths.get("src/main/resources/static/laptop.jpeg"));
            Product product = new Product(0, "Laptop", BigDecimal.valueOf(1200.99),
                    "Electronics", "Dell", "Powerful laptop", true, 10,
                    new Date(), "laptop.jpg", "image/jpeg", image);

            repo.save(product);
            System.out.println("Product inserted successfully!");
        }

    }
}
