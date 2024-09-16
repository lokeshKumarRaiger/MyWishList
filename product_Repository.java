package wishlistApp.example.wishlist_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wishlistApp.example.wishlist_app.model.Product;


public interface product_Repository extends JpaRepository<Product, Long>{

}
