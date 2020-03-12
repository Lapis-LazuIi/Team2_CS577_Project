package edu.drexel.TrainDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisplayResultsController {

	@GetMapping("/searchResults")
	public String index() {
		return "searchResults";
	}

}
