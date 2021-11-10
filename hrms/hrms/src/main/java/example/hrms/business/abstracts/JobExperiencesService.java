package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.JobExperiences;

public interface JobExperiencesService {
	 DataResult<List<JobExperiences>> getAll();
	 Result add(JobExperiences jobExperiences);
}
