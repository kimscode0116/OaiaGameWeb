package com.kopo.oaiaGamLab;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		String mainTitle = "메인페이지";
		model.addAttribute("m1", mainTitle );
		
		return "home";
	}
	
	@RequestMapping(value = "/createDB", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {

		GameDB db = new GameDB();
		boolean isSuccess = db.createDB();
		if (isSuccess) {
			model.addAttribute("m1", "Complete");

		} else {
			model.addAttribute("m1", "Already exist");
		}
		return "message";
	}

}
