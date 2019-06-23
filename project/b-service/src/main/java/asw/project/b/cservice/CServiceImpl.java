package asw.project.b.cservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asw.project.b.domain.CService;

@Service
public class CServiceImpl implements CService{

	@Autowired
	private CClient cClient;
	
	@Override
	public void saveAnimal(String message) {
		cClient.saveAnimal(message);
		
	}

}
