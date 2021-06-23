package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Car;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {

	@GetMapping(value = "/cars")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello Cars!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);


		String[] flowers = new String[] { "Rose", "Lily", "Tulip", "Carnation", "Hyacinth" };

		model.addAttribute("flowers", flowers);


		Car car1 = new Car(1, "Reno", 2001);
		Car car2 = new Car(2, "BMW", 2002);
		Car car3 = new Car(3, "Honda", 2003);
		Car car4 = new Car(4, "Volvo", 2004);
		Car car5 = new Car(5, "Toyota", 2005);

		ArrayList<Car> carsList = new ArrayList<>();
		carsList.add(car1);
		carsList.add(car2);
		carsList.add(car3);
		carsList.add(car4);
		carsList.add(car5);

		model.addAttribute("Cars", carsList);

//		ArrayList<Integer> carId = new ArrayList<>();
//		ArrayList<String> carModel = new ArrayList<>();
//		ArrayList<Integer> carYear = new ArrayList<>();
//
//		for (Car car: carsList) {
//			carId.add(car.getId());
//			carModel.add(car.getModel());
//			carYear.add(car.getYear());
//		}

//		model.addAttribute("ids", carId);
//		model.addAttribute("models", carModel);
//		model.addAttribute("years", carYear);






		return "cars";
	}


}