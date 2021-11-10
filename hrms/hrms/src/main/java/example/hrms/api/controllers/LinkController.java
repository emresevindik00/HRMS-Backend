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

import example.hrms.business.abstracts.LinkService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Link;

@RestController
@RequestMapping("/api/links")
@CrossOrigin
public class LinkController {
	private LinkService linkService;

	@Autowired
	public LinkController(LinkService linkService) {
		super();
		this.linkService = linkService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Link>> getAll() {
		return this.linkService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Link link) {
		return this.linkService.add(link);
	}
	
	@GetMapping("/getByResumeId")
	public DataResult<Link> getByJobAdvertisementId(@RequestParam int id){
		return this.linkService.findByResume_ResumeId(id);
	}
}
