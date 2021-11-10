package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Education;

public interface EducationService {
	
	DataResult <List<Education>> getAll();
	
	Result add(Education education);
	
	DataResult<List<Education>> getAllByResumeId(int resumeId);
	
	DataResult<Education> getResumeByResumeId(int resumeId);
	
}
