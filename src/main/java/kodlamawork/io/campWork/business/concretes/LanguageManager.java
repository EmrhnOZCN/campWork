package kodlamawork.io.campWork.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamawork.io.campWork.business.abstracts.LanguageService;
import kodlamawork.io.campWork.dataAccess.abstracts.LanguageRepository;
import kodlamawork.io.campWork.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	
	LanguageRepository languageRepository;
	
	

	public LanguageManager(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}



	@Override
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}



	@Override
	public void add(Language languages) {
		
		languageRepository.add(languages);
		
	}
	
	
	@Override
	public void delete(int id) {
		
		languageRepository.delete(id);
		
	}
	
	@Override
	public Language getById(int id) {
		
		return languageRepository.getById(id);
	}
	
	@Override
	public void update(Language language) {
		
		languageRepository.update(language);
		
	}
	
	



	
	
	
	

}
