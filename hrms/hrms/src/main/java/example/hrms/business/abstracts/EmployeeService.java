package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Employee;

public interface EmployeeService {
	
	DataResult <List<Employee>> getAll();
	
	Result add(Employee employee);
	
}
