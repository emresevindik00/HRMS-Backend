package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.hrms.business.abstracts.PositionService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.ErrorResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessDataResult;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.PositionDao;
import example.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{
	
	private PositionDao positionDao;

	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}
	
	@Override
	public DataResult<List<Position>> getAll() {
		return new SuccessDataResult<List<Position>>(this.positionDao.findAll(),"Datalar Listelendi!");
	}

	@Override
	public Result add(Position position) {
		
		if(!checkIfPositionExists(position.getPosition())) {
			return new ErrorResult("Bu Pozisyon Zaten Var");
		}
		else
		{
			this.positionDao.save(position);
			return new SuccessResult("Başarılı");
		}
		
		
	}
	
	public Boolean checkIfPositionExists(String positionName) {
		if(this.positionDao.getByPosition(positionName) != null) {
			return false;
		} 
		else {
			return true;
		}
	}

	
	
}
