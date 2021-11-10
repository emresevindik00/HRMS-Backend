package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.hrms.business.abstracts.EmployeeService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.ErrorResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessDataResult;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.EmployeeDao;
import example.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{
	
	EmployeeDao employeeDao;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"Datalar Listelendi!");
	}

	@Override
	public Result add(Employee employee) {
		
		if(!checkIfEmailExists(employee.getEmployeeMail())) {
			return new ErrorResult("Bu e-mail kullanılmış!");
		}
		
		else if(!checkIfTcNoExists(employee.getEmployeeTcNo()))
		{
			return new ErrorResult("Bu Tc No Daha Önce Kullanılmış!");
		}
		
		else 
		{
			this.employeeDao.save(employee);
			return new SuccessResult("İş Arayan Sisteme Eklendi.");
		}
		
	}
	
	public Boolean checkIfEmailExists (String email) {
		if (this.employeeDao.getByEmployeeMail(email) != null) {
			return false;
		} 
		else 
		{
			return true;
		}
	}
	
	
	public Boolean checkIfTcNoExists (String tcNo) {
		if(this.employeeDao.getByEmployeeTcNo(tcNo) != null) 
		{
			return false;
		}
		else 
		{
			return true;
		}
	}

}
