package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Link;

public interface LinkService {
	public DataResult<List<Link>> getAll();
	public Result add(Link link);
	DataResult<Link> findByResume_ResumeId(int id);
}
