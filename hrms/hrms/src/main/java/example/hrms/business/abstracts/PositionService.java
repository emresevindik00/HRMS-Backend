package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.Position;

public interface PositionService {
	DataResult<List<Position>> getAll();
	Result add(Position position);
	
}
