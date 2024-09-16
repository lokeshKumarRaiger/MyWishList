package wishlistApp.example.wishlist_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wishlistApp.example.wishlist_app.model.Wishlist;

public interface wishlist_Repository extends JpaRepository<Wishlist, Long> {

}
