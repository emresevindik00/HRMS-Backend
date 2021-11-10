package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.hrms.business.abstracts.LanguageService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessDataResult;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.LanguageDao;
import example.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageDao languageDao;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>
		(this.languageDao.findAll(),"Dil Geldi!");
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("Dil Başarıyla Eklendi!");
	}

	@Override
	public DataResult<Language> getResumeByResumeId(int resumeId) {
		return new SuccessDataResult<Language>
		(this.languageDao.findByResume_ResumeId(resumeId),"Dil Geldi!");
		
	}

}
