package asw.project.a.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service; 

@Service
public class AService {

	@Value("${animals}") 
	/* le parole di questo tipo */ 
	private String words;
	
	@Value("${instanceName}") 
	private String instanceName;
	
	@Autowired
	CService cService;
	
	
	private String getAnimal() {
		/* restituisce un animale a caso */ 
		String[] wordArray = words.split(",");
		int i = (int) (Math.round(Math.random()*(wordArray.length-1)));
		String word = wordArray[i];
		return word; 
	}

	public void insertAnimal() {
		StringBuilder sb = new StringBuilder();
		sb.append(instanceName);
		sb.append(": ");
		sb.append(this.getAnimal());
		cService.saveAnimal(sb.toString());
	}

	public String getAnimals() {
		return cService.getAnimals();
	}
	
}
