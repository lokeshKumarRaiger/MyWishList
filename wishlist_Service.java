package wishlistApp.example.wishlist_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wishlistApp.example.wishlist_app.model.Wishlist;
import wishlistApp.example.wishlist_app.repository.wishlist_Repository;

@Service
public class wishlist_Service {
	
	@Autowired
    private wishlist_Repository wishlistRepository;

    public List<Wishlist> getAllWishlists() {
        return wishlistRepository.findAll();
    }

    public Wishlist addProductToWishlist(Wishlist wishlist) {
        return wishlistRepository.save(wishlist);
    }

}
