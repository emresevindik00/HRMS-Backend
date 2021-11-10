package example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import example.hrms.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer>{
	Skill findByResume_ResumeId(int id);
}
