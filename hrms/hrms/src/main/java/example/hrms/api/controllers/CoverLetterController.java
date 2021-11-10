package example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.hrms.business.abstracts.CoverLetterService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLetterController {
	
	private CoverLetterService coverLetterService;

	@Autowired
	public CoverLetterController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<CoverLetter>> getAll(){
		return this.coverLetterService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CoverLetter coverLetter) {
		return this.coverLetterService.add(coverLetter);
	}
	
	@GetMapping("/getbyresumeid")
	public DataResult<List<CoverLetter>> getByResumeId(@RequestParam int resumeId){
		return this.coverLetterService.getAllByResumeId(resumeId);
	}
}
