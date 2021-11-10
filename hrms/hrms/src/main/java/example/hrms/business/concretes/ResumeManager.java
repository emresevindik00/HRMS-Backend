package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.hrms.business.abstracts.ResumeService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessDataResult;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.ResumeDao;
import example.hrms.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService{

	private ResumeDao resumeDao;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll(),"CV'ler listelendi!");
	}

	
	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("CV başarıyla eklendi!");
	}

	@Override
	public DataResult<Resume> findByEmployeeId(int id) {
		
		return new SuccessDataResult<Resume>(this.resumeDao.getByEmployee_Id(id),"CV id'ye göre getirildi!");
	}
	
}
