package asw.project.a.domain;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AProducerService {
	
	private Logger logger = Logger.getLogger(AProducerService.class.toString());
	
	@Autowired
	private AMessagePublisher aMessagePublisher;
	
	public void publish (String message) {
		logger.info("PUBBLICO IL MESSAGGIO: " + message);
		aMessagePublisher.publish(message);
	}
}
