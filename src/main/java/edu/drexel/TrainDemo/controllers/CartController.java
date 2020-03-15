package edu.drexel.TrainDemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.drexel.TrainDemo.models.Cart;
import edu.drexel.TrainDemo.service.ICartService;

@RestController
public class CartController {

	@Autowired
	private ICartService cartService;

	@GetMapping("/getCartItems")
	public String getCartItems(Model model) {
//
		List<Cart> carts = cartService.findAll();
//
		model.addAttribute("cartItems", carts);
		return "getCartItems";
	}

	@GetMapping("/addItemtoCart")
	public String getStopbyName(@RequestParam(name = "sourceId", required = true) Long sourceId,
			@RequestParam(name = "destinationId", required = true) Long destinationId,
			@RequestParam(name = "addOn", required = false, defaultValue = "false") boolean addOn,
			@RequestParam(name = "totalPrice", required = true) Double price, Model model) {

		Cart cartItem = cartService.Save(new Cart(addOn, destinationId, sourceId, price));

		model.addAttribute("cartItem", cartItem);
		return "addItemtoCart";
	}
}
