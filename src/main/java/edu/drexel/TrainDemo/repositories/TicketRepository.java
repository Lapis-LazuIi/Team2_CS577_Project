package edu.drexel.TrainDemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.drexel.TrainDemo.models.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

	@Override
	List<Ticket> findAll();

}
