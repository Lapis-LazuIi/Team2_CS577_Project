package edu.drexel.TrainDemo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String getStopbyName(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
//
		List<Stop> stops = stopService.findAllContaining("%" + name + "%");
//
		model.addAttribute("stops", stops);
		return "getStops";
	}

	@RequestMapping(value = "getStopAutoComplete", method = RequestMethod.GET)
	@ResponseBody
	public List<Stop> getStopAutoComplete(HttpServletRequest request) {

		return stopService.findAllContaining("%" + request.getParameter("term") + "%");

	}
}
