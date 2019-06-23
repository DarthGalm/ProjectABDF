package asw.project.b.domain;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asw.project.b.cservice.CClient;

@Service
public class BConsumerService {

	private Logger logger = Logger.getLogger(BConsumerService.class.toString());
	
	@Autowired
	private CService cService;
	
	public void onMessage(String message) {
		logger.info("RICEVUTO MESSAGGIO: " + message);
		cService.saveAnimal(message);
	}
}
