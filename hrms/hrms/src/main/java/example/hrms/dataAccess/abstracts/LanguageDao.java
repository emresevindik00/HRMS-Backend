package example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import example.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{
	Language findByResume_ResumeId(int id);
}
