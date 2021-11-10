package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.hrms.business.abstracts.CoverLetterService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessDataResult;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.CoverLetterDao;
import example.hrms.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService{
	
	private CoverLetterDao coverLetterDao;

	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		
		return new SuccessDataResult<List<CoverLetter>>
		(this.coverLetterDao.findAll(),"Kısa yazı başarıyla listelendi!");
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Kısa Yazı Başarıyla Eklendi!");
	}

	@Override
	public DataResult<List<CoverLetter>> getAllByResumeId(int resumeId) {
		
		return new SuccessDataResult<List<CoverLetter>>
		(this.coverLetterDao.getByResume_ResumeId(resumeId),"CV ID'sine göre kısa yazı getirildi!");
	}

}
