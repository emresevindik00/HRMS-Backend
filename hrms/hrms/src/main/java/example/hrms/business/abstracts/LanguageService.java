package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Language;

public interface LanguageService {
	DataResult <List<Language>> getAll();
	
	Result add(Language language);
	
	DataResult<Language> getResumeByResumeId(int resumeId);
}
