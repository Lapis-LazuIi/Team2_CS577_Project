package edu.drexel.TrainDemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.drexel.TrainDemo.models.Route;
import edu.drexel.TrainDemo.service.IRouteService;

@Controller
public class SearchController {

	@Autowired
	private IRouteService routeService;

	@GetMapping("/search")
	public String search(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "index";
	}

	@GetMapping("/searchbyAgency")
	public String searchbyAgency(Model model) {
//
		long agencyId = 51;
		List<Route> routes = routeService.findRoutebyAgencyID(agencyId);
//
		model.addAttribute("routes", routes);
		return "searchbyAgency";
	}

	@GetMapping("/searchOneWay")
	public String searchOneWay(Model model) {
//
		long agencyId = 51;
		List<Route> routes = routeService.findRoutebyAgencyID(agencyId);
//
		model.addAttribute("routes", routes);
		return "searchOneWay";
	}
}
