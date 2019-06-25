package asw.project.b.domain;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BConsumerService {

	private Logger logger = Logger.getLogger(BConsumerService.class.toString());
	
	@Value("${instanceName}") 
	private String instanceName;

	private String name;
	
	@Autowired
	private CService cService;
	
	public void onMessage(String message) {
		logger.info("RICEVUTO MESSAGGIO: " + message);
		if(name==null) {
			name=getName();
		}
		cService.saveAnimal(name + ": " + message);
	}

	private String getName() {
		String[] wordArray = instanceName.split(",");
		int i = (int) (Math.round(Math.random()*(wordArray.length-1)));
		String word = wordArray[i];
		return word; 
	}
}
