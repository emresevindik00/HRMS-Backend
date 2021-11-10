package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.hrms.business.abstracts.SkillService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessDataResult;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.SkillDao;
import example.hrms.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService{

	private SkillDao skillDao;
	
	@Autowired
	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public DataResult<List<Skill>> getAll() {
		return new SuccessDataResult<List<Skill>>(this.skillDao.findAll(),"Yetenekler Verenler Listelendi");
	}

	@Override
	public Result add(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult("Yetenekler Sisteme Eklendi");
	}

	@Override
	public DataResult<Skill> findByResume_ResumeId(int id) {
		return new SuccessDataResult<Skill>
		(this.skillDao.findByResume_ResumeId(id),"Dil Geldi!");
	}

}
