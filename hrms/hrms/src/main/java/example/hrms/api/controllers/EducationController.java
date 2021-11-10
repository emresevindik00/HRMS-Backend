package example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.hrms.business.abstracts.EducationService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Education;

@RestController
@RequestMapping("/api/educations")
public class EducationController {
	
	private EducationService educationService;

	@Autowired
	public EducationController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Education>> getAll(){
		return this.educationService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Education education) {
		return this.educationService.add(education);
	}
	
	@GetMapping("/getbyresumeid")
	public DataResult<List<Education>> getByResumeId(@RequestParam int resumeId){
		return this.getByResumeId(resumeId);
	}
	
	
}
