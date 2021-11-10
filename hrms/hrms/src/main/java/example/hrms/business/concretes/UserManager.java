package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.hrms.business.abstracts.UserService;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.UserDao;
import example.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public List<User> getAll() {
		return this.userDao.findAll();
	}
	
	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Başarılı");
	}
	
	
}
