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
	
	@Autowired
	private CService cService;
	
	public void onMessage(String message) {
		logger.info("RICEVUTO MESSAGGIO: " + message);
		cService.saveAnimal(instanceName + ": " + message);
	}
}
