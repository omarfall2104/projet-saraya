	package com.saraya;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.saraya.model.Car;
import com.saraya.model.CarService;

	@Controller
	public class CarController {
		@Autowired
		CarService cs;

		@RequestMapping(value="/list-car", method=RequestMethod.GET)
		public String showList(ModelMap model) {
		  model.addAttribute("cars", cs.getAllCars());
			return "carList";
		}
		
		@RequestMapping(value="/add-car", method=RequestMethod.GET)
		public String addCarForm(ModelMap model) {
			model.addAttribute("rapide", new Car());
		  
			return "addCar"; 
		}
		/*@RequestMapping(value="/update-car", method=RequestMethod.GET)
		public String updateCarForm(ModelMap model, @RequestParam int id) {
		  
			return "addCar"; */
		
		@RequestMapping(value="/add-car", method=RequestMethod.POST)
		public String carAdded(ModelMap model, @Valid @ModelAttribute("rapide")  Car car,
				 BindingResult result) {
				if(result.hasErrors())
					return "addCar";
			cs.addCar(car.getYear(), car.getMake(), car.getModel(), car.getImage());
				model.clear();
		  
			return "redirect:/list-car";
		}
		
		@RequestMapping(value="/delete-car", method=RequestMethod.GET)
		public String DeleteList(ModelMap model, 
				@RequestParam int id) {
		  cs.removeCar(id);
		  model.clear();
			return "redirect:/list-car";
		}
		
		
		/*@RequestMapping(value="/update-Car", method=RequestMethod.POST)
		public String CarListUpdate(ModelMap model, @Valid Car ch) {
		  cs.updateCar(ch);
		  model.clear();
			return "redirect:/carList";
		}*/
		
		@RequestMapping(value = "/update-car", method = RequestMethod.GET)
		public String showUpdateCarForm(ModelMap model, @RequestParam int id) {
			model.addAttribute("rapide", cs.findById(id));
			return "addCar";
		}

		@RequestMapping(value = "/update-car", method = RequestMethod.POST)
		public String updateCar(ModelMap model, @Valid @ModelAttribute("rapide") Car car,
				BindingResult result) {
			if (result.hasErrors())
				return "addCar";
			
			cs.updateCar(car);
			
		
			model.clear();// to prevent request parameter "name" to be passed
			return "redirect:/list-car";
		
		}
	}
		/*public car findById(int id) {
			for(Car raps : cars) {
				if()
			}
		}*/
		
	



