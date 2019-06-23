package asw.project.a.bservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import asw.project.a.domain.AMessagePublisher;
import asw.project.a.domain.BService;

@Component
public class BServiceImpl implements BService{
	
	@Autowired
	AMessagePublisher aMessagePublisher;

	@Override
	public void saveAnimal(String message) {
		aMessagePublisher.publish(message);
	}

}
