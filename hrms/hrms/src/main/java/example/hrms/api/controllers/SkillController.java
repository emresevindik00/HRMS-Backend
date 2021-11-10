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
import example.hrms.business.abstracts.SkillService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skills")
@CrossOrigin
public class SkillController {
	private SkillService skillService;
	
	
	@Autowired
	public SkillController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}


	@GetMapping("/getall")
	public DataResult<List<Skill>> getAll(){
		return this.skillService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Skill skill) {
		return this.skillService.add(skill);
	}
	
	@GetMapping("/getByResumeId")
	public DataResult<Skill> getByJobAdvertisementId(@RequestParam int id){
		return this.skillService.findByResume_ResumeId(id);
	}
}
