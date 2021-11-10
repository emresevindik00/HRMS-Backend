package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Employer;

public interface EmployerService {
	
	DataResult <List<Employer>> getAll();
	
	Result add(Employer employer);
	
}
