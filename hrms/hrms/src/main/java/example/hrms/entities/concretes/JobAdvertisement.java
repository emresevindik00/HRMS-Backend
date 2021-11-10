package example.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Table(name="job_advertisements")
@Entity
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="advertisement_id")
	private int jobAdvertisementId;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="needed_employee")
	private int neededEmployee;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="expiration_date")
	private Date  expirationDate;

	@Column(name="city")
	private String city;
	
	@ManyToOne
	
	@JoinColumn(name="job_position_id")
	private Position position;
	
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JsonIgnoreProperties({"id"})
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	public JobAdvertisement() {
		
	}

	public JobAdvertisement(int jobAdvertisementId, String salary, int neededEmployee, String jobDescription,
			Date expirationDate, String city, Position position, Employer employer) {
		super();
		this.jobAdvertisementId = jobAdvertisementId;
		this.salary = salary;
		this.neededEmployee = neededEmployee;
		this.jobDescription = jobDescription;
		this.expirationDate = expirationDate;
		this.city = city;
		this.position = position;
		this.employer = employer;
	}

	public int getJobAdvertisementId() {
		return jobAdvertisementId;
	}

	public void setJobAdvertisementId(int jobAdvertisementId) {
		this.jobAdvertisementId = jobAdvertisementId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getNeededEmployee() {
		return neededEmployee;
	}

	public void setNeededEmployee(int neededEmployee) {
		this.neededEmployee = neededEmployee;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public Date  getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date  expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	
	
}


