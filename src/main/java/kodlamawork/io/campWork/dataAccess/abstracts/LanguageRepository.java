package kodlamawork.io.campWork.dataAccess.abstracts;

import java.util.List;



import kodlamawork.io.campWork.entities.concretes.Language;


public interface LanguageRepository {
	
	
	List<Language> getAll();
	
	
	void add(Language language);
	
	void delete(int id);
	
	Language getById(int id);
	
	void update(Language language);
	
	
	

}
