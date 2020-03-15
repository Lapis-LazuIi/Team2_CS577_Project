package edu.drexel.TrainDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.drexel.TrainDemo.models.Route;
import edu.drexel.TrainDemo.repositories.RouteRepository;

@Service
public class RouteService implements IRouteService {

	@Autowired
	private RouteRepository routeRepository;

	@Override
	public List<Route> findRoutebyAgencyID(long AgencyID) {
		List<Route> routes = routeRepository.findByAgency_Id(AgencyID);
		return routes;
	}

	@Override
//	public List<Route> findOneway(String source, String destination, String date, String name, int adult,
	// int seniorCitizen, int children, int infant) {
	public List<Route> findOneway(String source, String destination) {
//		List<Route> routesOneway = routeRepository.findOneway(source, destination, date, name, adult, seniorCitizen,
//				children, infant);
		List<Route> routesOneway = routeRepository.findOneway(source, destination);
		return routesOneway;
	}

}
