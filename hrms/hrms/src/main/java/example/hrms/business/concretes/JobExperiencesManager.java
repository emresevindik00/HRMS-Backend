package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import example.hrms.business.abstracts.JobExperiencesService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessDataResult;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.JobExperiencesDao;
import example.hrms.entities.concretes.JobExperiences;

@Service
public class JobExperiencesManager implements JobExperiencesService{
	
	private JobExperiencesDao jobExperiencesDao;
	
	
	@Autowired
	public JobExperiencesManager(JobExperiencesDao jobExperiencesDao) {
		super();
		this.jobExperiencesDao = jobExperiencesDao;
	}


	@Override
	public DataResult<List<JobExperiences>> getAll() {
		return new SuccessDataResult<List<JobExperiences>>(this.jobExperiencesDao.findAll(),"Datalar Listelendi!");
	}


	@Override
	public Result add(@RequestBody JobExperiences jobExperiences) {
		this.jobExperiencesDao.save(jobExperiences);
		return new SuccessResult("Tecrübeler Sisteme Eklendi.");
		
	}

	
}
