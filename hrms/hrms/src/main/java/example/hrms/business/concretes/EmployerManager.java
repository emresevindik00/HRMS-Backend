package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.hrms.business.abstracts.EmployerService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.ErrorResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessDataResult;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.EmployerDao;
import example.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"İş Verenler Listelendi");
	}

	@Override
	public Result add(Employer employer) {
		
		if(!checkIfEmployerMailExists(employer.getEmployerMail())) {
			return new ErrorResult("Bu e-mail kullanılmış!");
		} 
		else
		{
			this.employerDao.save(employer);
			return new SuccessResult("İş Veren Sisteme Eklendi");
		}
		
	}
	
	public Boolean checkIfEmployerMailExists(String email) {
		if(this.employerDao.getByEmployerMail(email) != null) {
			return false;
		} 
		else 
		{
			return true;
		}
	}
	

}
