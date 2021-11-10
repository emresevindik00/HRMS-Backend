package example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.hrms.business.abstracts.PositionService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Position;

@RestController
@RequestMapping("/api/positions")
@CrossOrigin
public class PositionController {
	private PositionService positionService;
	
	
	@Autowired
	public PositionController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}


	@GetMapping("/getall")
	public DataResult<List<Position>> getAll(){
		return this.positionService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Position position) {
		return this.positionService.add(position);
	}
}
