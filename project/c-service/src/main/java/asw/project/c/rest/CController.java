package asw.project.c.rest;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import asw.project.c.domain.CService; 

@RestController
public class CController {

	@Autowired 
	private CService CService;

	private final Logger logger = Logger.getLogger(CController.class.toString()); 
	
	
	@PostMapping("/")
	public void saveAnimal(@RequestBody String name) {
		logger.info("Inserisco nuovo animale.");
		this.CService.saveAnimal(name);
	}
	
	@GetMapping("/")
	public String getAnimals() {
		logger.info("Prendo tutti gli animali.");
		return this.CService.getAnimals();
	}
	
}