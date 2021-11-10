package example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import example.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
