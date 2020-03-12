package edu.drexel.TrainDemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.drexel.TrainDemo.models.Stop;
import edu.drexel.TrainDemo.service.IStopService;

@Controller
public class StopController {

	@Autowired
	private IStopService stopService;

	@GetMapping("/getStops")
	public String getStops(Model model) {
//
		List<Stop> stops = stopService.findAll();
//
		model.addAttribute("stops", stops);
		return "getStops";
	}

	@GetMapping("/getStopbyName")
	public String getStopbyName(@RequestParam(name = "name", required = false, defaultValue = "New") String name,
			Model model) {
//
		List<Stop> stops = stopService.findAllContaining("%" + name + "%");
//
		model.addAttribute("stops", stops);
		return "getStops";
	}
}
