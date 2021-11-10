package example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import example.hrms.entities.concretes.Link;

public interface LinkDao extends JpaRepository<Link, Integer>{
	Link findByResume_ResumeId(int id);
}
