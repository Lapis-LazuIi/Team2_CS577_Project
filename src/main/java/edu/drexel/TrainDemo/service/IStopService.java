package edu.drexel.TrainDemo.service;

import java.util.List;

import edu.drexel.TrainDemo.models.Stop;

public interface IStopService {
	List<Stop> findAll();

	List<Stop> findAllContaining(String name);
}
