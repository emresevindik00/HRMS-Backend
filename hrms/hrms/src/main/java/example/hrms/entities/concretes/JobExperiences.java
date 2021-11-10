package example.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Table(name="job_experiences")
@Entity
public class JobExperiences {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_experiences_id")
	private int jobExperiencesId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="job_position")
	private String jobPosition;
	
	@Column(name="job_start_day")
	private Date jobStartDay;
	
	@Column(name="job_dismiss_date")
	private Date jobDismissDate;
	
	@JsonIgnore 
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;

	
	public JobExperiences() {
		
	}
	
	public JobExperiences(int jobExperiencesId, String companyName, String jobPosition, Date jobStartDay,
			Date jobDismissDate, Resume resume) {
		super();
		this.jobExperiencesId = jobExperiencesId;
		this.companyName = companyName;
		this.jobPosition = jobPosition;
		this.jobStartDay = jobStartDay;
		this.jobDismissDate = jobDismissDate;
		this.resume = resume;
	}

	public int getJobExperiencesId() {
		return jobExperiencesId;
	}

	public void setJobExperiencesId(int jobExperiencesId) {
		this.jobExperiencesId = jobExperiencesId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public Date getJobStartDay() {
		return jobStartDay;
	}

	public void setJobStartDay(Date jobStartDay) {
		this.jobStartDay = jobStartDay;
	}

	public Date getJobDismissDate() {
		return jobDismissDate;
	}

	public void setJobDismissDate(Date jobDismissDate) {
		this.jobDismissDate = jobDismissDate;
	}


}
