package kodlamawork.io.campWork.business.abstracts;

import java.util.List;

import kodlamawork.io.campWork.entities.concretes.Language;

public interface LanguageService {
	
	List<Language> getAll();
	
	void add(Language languages);
	
	void delete(int id);
	
	Language getById(int id);
	
	void update(Language language);
	
	

}
