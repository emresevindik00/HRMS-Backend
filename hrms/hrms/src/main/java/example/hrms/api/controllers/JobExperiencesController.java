package example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import example.hrms.business.abstracts.JobExperiencesService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.JobExperiences;

@RestController
@CrossOrigin
@RequestMapping("/api/jobexperiences")
public class JobExperiencesController {
	private JobExperiencesService jobExperiencesService;

	@Autowired
	public JobExperiencesController(JobExperiencesService jobExperiencesService) {
		super();
		this.jobExperiencesService = jobExperiencesService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobExperiences>> getAll(){
		return this.jobExperiencesService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobExperiences jobExperiences) {
		return this.jobExperiencesService.add(jobExperiences);
	}
}
