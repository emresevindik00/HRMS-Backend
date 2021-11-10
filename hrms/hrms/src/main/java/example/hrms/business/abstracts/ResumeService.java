package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Resume;

public interface ResumeService {
	DataResult <List<Resume>> getAll();
	
	Result add(Resume resume);
	
	DataResult<Resume> findByEmployeeId(int id);
}
