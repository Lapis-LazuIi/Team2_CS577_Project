package edu.drexel.TrainDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.drexel.TrainDemo.models.Stop;
import edu.drexel.TrainDemo.repositories.StopRepository;

@Service
public class StopService implements IStopService {

	@Autowired
	private StopRepository stopRepository;

	@Override
	public List<Stop> findAll() {
		List<Stop> stops = stopRepository.findAll();
		return stops;
	}

	@Override
	public List<Stop> findAllContaining(String name) {
		List<Stop> stops = stopRepository.findAllContaining(name);
		return stops;
	}

}
