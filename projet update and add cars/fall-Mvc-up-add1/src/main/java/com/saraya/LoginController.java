package com.saraya;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value="/login", method= RequestMethod.GET)
	
	public String loginPage() {
		
		
			UserValidation uv1 = new UserValidation();
		
			return "login";
	
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String showPage(@ModelAttribute(value="name")UserValidation uv1, 
			ModelMap model, String name, String pass) {
		if(uv1.userValidation(name, pass)) {
		return "home";
	}  
		else {
		model.addAttribute("errorMessage", "User name or password provided incorrect");
		return "login";
	}
	}


}
