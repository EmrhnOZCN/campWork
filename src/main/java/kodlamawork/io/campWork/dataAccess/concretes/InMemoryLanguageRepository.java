package kodlamawork.io.campWork.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamawork.io.campWork.dataAccess.abstracts.LanguageRepository;
import kodlamawork.io.campWork.entities.concretes.Language;


@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	
	List<Language> languages;
	

	public InMemoryLanguageRepository() {
		
		
		languages = new ArrayList<Language>();
		
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Python"));
		
	}
	
	
	@Override
	public List<Language> getAll() {
		
		return languages;
	}
	
	@Override
	public void add(Language language) {
		
		languages.add(language);
	}
	
	@Override
	public void delete(int id) {
		 
		languages.remove(id);
		
	}
	
	@Override
	public Language getById(int id) {
		
		return languages.get(id);
	}
	
	@Override
	public void update(Language language) {
		
		languages.set(language.getId()-1, language);
		}
		
	}
	
		
		
	

	
	
	
	

	


