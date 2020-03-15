package edu.drexel.TrainDemo.service;

import java.util.List;

import edu.drexel.TrainDemo.models.Cart;

public interface ICartService {

	List<Cart> findAll();

	Cart Save(Cart cart);
}
