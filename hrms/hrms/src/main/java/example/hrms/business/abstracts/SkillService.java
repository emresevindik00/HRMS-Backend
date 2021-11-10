package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Skill;

public interface SkillService {
	
	DataResult<List<Skill>> getAll();
	Result add(Skill skill);
	DataResult<Skill> findByResume_ResumeId(int id);
}
