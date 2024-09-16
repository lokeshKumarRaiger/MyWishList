package wishlistApp.example.wishlist_app.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wishlistApp.example.wishlist_app.model.Wishlist;
import wishlistApp.example.wishlist_app.service.wishlist_Service;

@RestController
@RequestMapping("/wishlists")
public class wishlist_Controllers {
	@Autowired
    private wishlist_Service wishlistService;

    @GetMapping
    public List<Wishlist> getAllWishlists() {
        return wishlistService.getAllWishlists();
    }

    @PostMapping
    public Wishlist addProductToWishlist(@RequestBody Wishlist wishlist) {
        return wishlistService.addProductToWishlist(wishlist);
    }

}
