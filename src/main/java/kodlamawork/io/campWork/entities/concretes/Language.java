package kodlamawork.io.campWork.entities.concretes;

public class Language {
	
	private String name;
	
	private int id;

	public Language() {
		
	}

	public Language(int id , String name) {
		
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	

}
