package wishlistApp.example.wishlist_app.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wishlistApp.example.wishlist_app.repository.user_Repository;

@Service
public class user_Service {
	
	@Autowired
    private user_Repository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

	
}
