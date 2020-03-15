package edu.drexel.TrainDemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.drexel.TrainDemo.models.Cart;

public interface CartRepository extends CrudRepository<Cart, Long> {

	@Override
	List<Cart> findAll();

	@Override
	Cart save(Cart cartItem);

}
