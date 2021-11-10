package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.hrms.business.abstracts.EducationService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessDataResult;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.EducationDao;
import example.hrms.entities.concretes.Education;

@Service
public class EducationManager implements EducationService{

	private EducationDao educationDao;
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>
		(this.educationDao.findAll(),"Eğitim bilgileri başarıyla listelendi");
	}

	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Eğitim bilgisi başarıyla eklendi!");
	}

	@Override
	public DataResult<List<Education>> getAllByResumeId(int resumeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Education> getResumeByResumeId(int resumeId) {
		
		return this.getResumeByResumeId(resumeId);
	}

}
