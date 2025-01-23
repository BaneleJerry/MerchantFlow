package dev.banelethabede.MerchantFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.banelethabede.MerchantFlow.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
