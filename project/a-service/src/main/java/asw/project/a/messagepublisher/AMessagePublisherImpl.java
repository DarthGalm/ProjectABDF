package asw.project.a.messagepublisher;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

import asw.project.a.domain.AMessagePublisher;

@Component
public class AMessagePublisherImpl implements AMessagePublisher{

	private Logger logger = Logger.getLogger(AMessagePublisherImpl.class.toString());
	
	@Value("${asw.kafka.channel.out}")
	private String channel;
	
	@Autowired
	private KafkaTemplate<String,String> template;
	
	@Override
	public void publish(String message) {
		logger.info("STO INVIANDO: " + message);
		template.send(channel, message);
	}

}
