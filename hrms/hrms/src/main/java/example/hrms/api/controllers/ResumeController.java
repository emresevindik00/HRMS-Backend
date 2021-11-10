package example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.hrms.business.abstracts.ResumeService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Resume;

@RestController
@RequestMapping("/api/resumes")
@CrossOrigin
public class ResumeController {
	private ResumeService resumeService;

	@Autowired
	public ResumeController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Resume>> getAll(){
		return this.resumeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Resume resume) {
		return this.resumeService.add(resume);
	}
	
	@GetMapping("/findByEmployeeId")
	public DataResult<Resume> findByEmployeeId(@RequestParam int id){
		return this.resumeService.findByEmployeeId(id);
	}
	
	
}
