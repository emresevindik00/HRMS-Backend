package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
	Result add(User user);
}
