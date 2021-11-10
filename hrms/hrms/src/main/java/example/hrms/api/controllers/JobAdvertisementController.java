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

import example.hrms.business.abstracts.JobAdvertisementService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
@CrossOrigin
public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getSortedByDate")
	public DataResult<List<JobAdvertisement>> getAllSorted(){
		return this.jobAdvertisementService.getAllSorted();
	}
	
	@GetMapping("/getByCompanyName")
	public DataResult<List<JobAdvertisement>> getByCompanyName(@RequestParam String companyName){
		return this.jobAdvertisementService.getByCompanyName(companyName);
	}
	
	@GetMapping("/getByJobAdvertisementId")
	public DataResult<JobAdvertisement> getByJobAdvertisementId(@RequestParam int id){
		return this.jobAdvertisementService.getByjobAdvertisementId(id);
	}
}
