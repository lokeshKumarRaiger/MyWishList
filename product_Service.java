package wishlistApp.example.wishlist_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wishlistApp.example.wishlist_app.model.Product;
import wishlistApp.example.wishlist_app.repository.product_Repository;

@Service
public class product_Service {
	@Autowired
    private product_Repository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
