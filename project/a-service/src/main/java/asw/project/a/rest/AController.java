package asw.project.a.rest;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import asw.project.a.domain.AService; 

@RestController
public class AController {

	@Autowired 
	private AService aService;

	private final Logger logger = Logger.getLogger(AController.class.toString()); 
	
	
	@PostMapping("/")
	public void insertAnimal() {
		aService.insertAnimal();
	}
	
	@GetMapping("/")
	public String getAnimals() {
		return aService.getAnimals();
	}
	
}
