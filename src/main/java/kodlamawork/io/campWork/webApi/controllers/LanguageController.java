package kodlamawork.io.campWork.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamawork.io.campWork.business.abstracts.LanguageService;
import kodlamawork.io.campWork.entities.concretes.Language;


@RestController
@RequestMapping("/api/language") 	
public class LanguageController {
	
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	
	@GetMapping("/getAll")
	public List<Language> getAll() {
		
		return languageService.getAll();
	}
	
	
	@GetMapping("/getById")
	public Language getById(int id) {
		
		return languageService.getById(id-1);
	}
	
	
	@PostMapping("/add")
	public void add(Language languages) {
		
		languageService.add(languages);
	}
	@PostMapping("/update")
	public void update(Language language) {
		
		languageService.update(language);
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) {
		
		languageService.delete(id-1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
