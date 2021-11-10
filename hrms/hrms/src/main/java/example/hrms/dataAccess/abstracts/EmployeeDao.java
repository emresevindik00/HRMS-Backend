package example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import example.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
	Employee getByEmployeeMail(String employeeMail);
	
	Employee getByEmployeeTcNo(String TcNo);
	
	
}
