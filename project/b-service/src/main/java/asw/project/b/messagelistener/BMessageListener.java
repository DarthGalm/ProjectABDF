package asw.project.b.messagelistener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import asw.project.b.domain.BConsumerService;

@Component
public class BMessageListener {

	private Logger logger = Logger.getLogger(BMessageListener.class.toString());
	
	@Value("${asw.kafka.channel.in}")
	private String channel;
	
	@Value("${asw.kafka.groupid}")
	private String groupId;
	
	@Autowired
	BConsumerService bConsumerService;
	
	@KafkaListener(topics = "${asw.kafka.channel.in}", groupId = "${asw.kafka.groupId}")
	public void listen(ConsumerRecord<String,String> record) throws Exception {
		String message = record.value();
		bConsumerService.onMessage(message);
	}
	
}
