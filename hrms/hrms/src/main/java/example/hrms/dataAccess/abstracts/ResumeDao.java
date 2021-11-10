package example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import example.hrms.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer>{
	Resume getByEmployee_Id(int id);
}
