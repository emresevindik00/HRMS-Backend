package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.CoverLetter;


public interface CoverLetterService {
	
	DataResult <List<CoverLetter>> getAll();
	
	Result add(CoverLetter coverLetter);
	
	DataResult<List<CoverLetter>> getAllByResumeId(int resumeId);
}
