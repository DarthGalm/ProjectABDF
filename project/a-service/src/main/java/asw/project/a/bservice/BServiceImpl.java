package asw.project.a.bservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asw.project.a.domain.AProducerService;
import asw.project.a.domain.BService;

@Service
public class BServiceImpl implements BService{
	
	@Autowired
	AProducerService aProducerService;

	@Override
	public void saveAnimal(String message) {
		aProducerService.publish(message);
	}

}
