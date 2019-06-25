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

	private String name;
	
	@Autowired
	CService cService;
	
	@Autowired
	BService bService;
	
	private String getAnimal() {
		/* restituisce un animale a caso */ 
		String[] wordArray = words.split(",");
		int i = (int) (Math.round(Math.random()*(wordArray.length-1)));
		String word = wordArray[i];
		return word; 
	}

	public void insertAnimal() {
		StringBuilder sb = new StringBuilder();
		if(name == null) {
			name=getName();
		}
		sb.append(name);
		sb.append(": ");
		sb.append(this.getAnimal());
		bService.saveAnimal(sb.toString());
	}

	private String getName() {
		String[] wordArray = instanceName.split(",");
		int i = (int) (Math.round(Math.random()*(wordArray.length-1)));
		String word = wordArray[i];
		return word; 
	}

	public String getAnimals() {
		return cService.getAnimals();
	}
	
}
