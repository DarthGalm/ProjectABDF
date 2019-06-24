package asw.project.a.cservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asw.project.a.domain.CService;

@Service
public class CServiceImpl implements CService{

	@Autowired 
	private CClient cClient;

	@Override
	public String getAnimals() {
		return cClient.getAnimals();
	}

}
