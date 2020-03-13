package edu.drexel.TrainDemo.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.drexel.TrainDemo.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

	@Override
	User save(User user);

}
