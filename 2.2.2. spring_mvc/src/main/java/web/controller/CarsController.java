package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;

import java.util.ArrayList;


@Controller
public class CarsController {

	@GetMapping(value = "/cars")
	public String printWelcome(ModelMap model,
							   @RequestParam(value = "count", required = false, defaultValue = "5") int count) {

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

		if (count > carsList.size()) {
			count = carsList.size();
		}

		ArrayList<Car> carsList2 = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			carsList2.add(carsList.get(i));
		}

		model.addAttribute("Cars", carsList2);

		return "cars";
	}

}