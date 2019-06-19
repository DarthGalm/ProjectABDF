@Service
public class CService {

	@Value("${name}") 
	private String names;

	/*nome utente*/
	private String name;

	/*coppie <nome,animale> salvate */
    private List<String> lista = new ArrayList<String>();
	

	public void saveAnimals(name) {
		this.lista.add(name);
	}

	public String getAnimals() {
		String final= String.join(",",this.lista);
		if(this.name == null){
			int num= new Random().nextInt(this.names.legnth());
			this.name= this.names[num];
		}
		return this.name + "  :[" + final +"]";
	}
	
}