package example.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Table(name="employees")
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employees_id")
	private int id;
	
	@Column(name="first_name")
	private String employeeName;
	
	@Column(name="last_name")
	private String employeeSurname;
	
	@Column(name="tc_no")
	private String employeeTcNo;
	
	@Column(name="birth_year")
	private String employeeBirthYear;
	
	@Column(name="employees_mail")
	private String employeeMail;
	
	@Column(name="password")
	private String employeePassword;
	
	
	@OneToMany(mappedBy="employee")
	@JsonIgnore 
	private List<Resume> resume;
	

	public Employee(int id, String employeeName, String employeeSurname, String employeeTcNo, String employeeBirthYear,
			String employeeMail, String employeePassword, List<Resume> resume) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeSurname = employeeSurname;
		this.employeeTcNo = employeeTcNo;
		this.employeeBirthYear = employeeBirthYear;
		this.employeeMail = employeeMail;
		this.employeePassword = employeePassword;
		this.resume = resume;
	}
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSurname() {
		return employeeSurname;
	}

	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}

	public String getEmployeeTcNo() {
		return employeeTcNo;
	}

	public void setEmployeeTcNo(String employeeTcNo) {
		this.employeeTcNo = employeeTcNo;
	}

	public String getEmployeeBirthYear() {
		return employeeBirthYear;
	}

	public void setEmployeeBirthYear(String employeeBirthYear) {
		this.employeeBirthYear = employeeBirthYear;
	}

	public String getEmployeeMail() {
		return employeeMail;
	}

	public void setEmployeeMail(String employeeMail) {
		this.employeeMail = employeeMail;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	

}
