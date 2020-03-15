package edu.drexel.TrainDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.drexel.TrainDemo.models.Cart;
import edu.drexel.TrainDemo.repositories.CartRepository;

@Service
public class CartService implements ICartService {

	@Autowired
	private CartRepository cartRepository;

	@Override
	public List<Cart> findAll() {

		List<Cart> cartItems = cartRepository.findAll();
		return cartItems;
	}

	@Override
	public Cart Save(Cart cart) {
		Cart cartItem = cartRepository.save(cart);
		return cartItem;
	}

}
