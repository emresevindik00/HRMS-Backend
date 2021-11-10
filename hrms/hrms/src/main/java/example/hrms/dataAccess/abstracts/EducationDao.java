package example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import example.hrms.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer>{
	List<Education> getByResume_ResumeId(int Id);
	
	Education findByResume_ResumeId(int id);
}
