package edu.drexel.TrainDemo.service;

import java.util.List;

import edu.drexel.TrainDemo.models.Route;

public interface IRouteService {

	List<Route> findRoutebyAgencyID(long AgencyID);

//	List<Route> findOneway(String source, String destination, String date, String name, int adult, int seniorCitizen,
//			int children, int infant);
	List<Route> findOneway(String source, String destination);
}
