package asw.project.c.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service; 

@Service
public class CService {

	@Value("${name}") 
	private String name;

	/*coppie <nome,animale> salvate */
    private List<String> lista = new ArrayList<String>();
	

	public void saveAnimal(String name) {
		this.lista.add(name);
	}

	public String getAnimals() {
		String finalString = String.join(",",this.lista);
		return this.name + "  :[" + finalString +"]";
	}
	
}