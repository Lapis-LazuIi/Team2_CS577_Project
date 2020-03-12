package edu.drexel.TrainDemo.service;

import java.util.List;

import edu.drexel.TrainDemo.models.Route;

public interface IRouteService {

	List<Route> findRoutebyAgencyID(long AgencyID);
}
