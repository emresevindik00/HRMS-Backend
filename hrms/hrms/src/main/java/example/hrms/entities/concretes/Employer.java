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


@Entity
@Table(name="employers")
public class Employer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employers_id")
	private int employerId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_adress")
	private String webAdress;
	
	@Column(name="phone")
	private String employerPhone;
	
	@Column(name="employers_mail")
	public String employerMail;
	
	@OneToMany(mappedBy="employer")
	@JsonIgnore 
	private List<JobAdvertisement> jobAdvertisements;
	
	public Employer() {
		
	}

	public Employer(int employerId, String companyName, String webAdress, String employerPhone, String employerMail,
			List<JobAdvertisement> jobAdvertisements) {
		super();
		this.employerId = employerId;
		this.companyName = companyName;
		this.webAdress = webAdress;
		this.employerPhone = employerPhone;
		this.employerMail = employerMail;
		this.jobAdvertisements = jobAdvertisements;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebAdress() {
		return webAdress;
	}

	public void setWebAdress(String webAdress) {
		this.webAdress = webAdress;
	}

	public String getEmployerPhone() {
		return employerPhone;
	}

	public void setEmployerPhone(String employerPhone) {
		this.employerPhone = employerPhone;
	}

	public String getEmployerMail() {
		return employerMail;
	}

	public void setEmployerMail(String employerMail) {
		this.employerMail = employerMail;
	}
	
	
	
	
}
