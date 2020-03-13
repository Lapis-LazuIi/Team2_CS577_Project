package edu.drexel.TrainDemo.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.drexel.TrainDemo.models.User;
import edu.drexel.TrainDemo.service.IUserService;

@RestController
public class UserController {
	@Autowired
	private IUserService iUserService;

	@GetMapping("/user")
	public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
		return Collections.singletonMap("name", principal.getAttribute("name"));
	}

	@GetMapping("/userCreation")
	public String getStops(Model model) {

		String firstName = "abc";
		String lastName = "abc";
		String password = "abc";
		String emailAddress = "abc";
		User user = new User(firstName, lastName, emailAddress, password);
		iUserService.save(user);

		return "success";
	}
}