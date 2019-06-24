package asw.project.a.cservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("c")
public interface CClient {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAnimals();
}
