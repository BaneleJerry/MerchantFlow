package dev.banelethabede.MerchantFlow.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import dev.banelethabede.MerchantFlow.model.Product;
import dev.banelethabede.MerchantFlow.repository.ProductRepository;

@Service
public class ProductService {

    // List<Product> products = new ArrayList<>(Arrays.asList(new Product(2, "Mayo", 5.00)));

    @Autowired
    ProductRepository repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void removeProductById(int id) {
     repo.deleteById(id);

    }

    public Product addproduct(Product product, MultipartFile imagefile) throws IOException {
        product.setImageName(imagefile.getOriginalFilename());
        product.setImageType(imagefile.getContentType());
        product.setImageDate(imagefile.getBytes());    
        return repo.save(product);
    }

public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
        
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageDate(imageFile.getBytes());
        return repo.save(product);
    }

}
