package com.hunter.gamecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

	@RequestMapping("/game")
	public ModelAndView getGamePage() {

		ModelAndView modelAndView = new ModelAndView("Game");

		return modelAndView;
	}
}
