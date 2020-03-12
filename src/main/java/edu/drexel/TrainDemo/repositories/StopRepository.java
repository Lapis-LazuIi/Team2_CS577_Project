package edu.drexel.TrainDemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.drexel.TrainDemo.models.Stop;

public interface StopRepository extends CrudRepository<Stop, Long> {

	@Override
	List<Stop> findAll();

	@Query("from Stop where name like :name ")

	List<Stop> findAllContaining(@Param("name") String name);

}
