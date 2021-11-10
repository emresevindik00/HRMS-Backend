package example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import example.hrms.entities.concretes.JobExperiences;

public interface JobExperiencesDao extends JpaRepository<JobExperiences, Integer>{

}
