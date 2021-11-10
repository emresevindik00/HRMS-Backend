package example.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "resumes")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="resume_id")
	private int resumeId;
	
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	
	@OneToMany(mappedBy = "resume")
	private List<Language> language;

	@JsonIgnore 
	@OneToMany(mappedBy = "resume")
	private List<Education> Education;
	
	 
	
	@OneToMany(mappedBy = "resume")
	private List<JobExperiences> jobExperiences;
	
	
	
	@OneToMany(mappedBy = "resume")
	private List<CoverLetter> coverLetters;
		
	
	@OneToMany(mappedBy = "resume")
	private List<Link> link;
	
	
	@OneToMany(mappedBy = "resume")
	private List<Skill> skills;

	
	public Resume(int resumeId, Employee employee, List<Language> language,
			List<example.hrms.entities.concretes.Education> education, List<JobExperiences> jobExperiences,
			List<CoverLetter> coverLetters, List<Link> link, List<Skill> skills) {
		super();
		this.resumeId = resumeId;
		this.employee = employee;
		this.language = language;
		Education = education;
		this.jobExperiences = jobExperiences;
		this.coverLetters = coverLetters;
		this.link = link;
		this.skills = skills;
	}
	
	public Resume() {
		
	}

	public int getResumeId() {
		return resumeId;
	}

	public void setResumeId(int resumeId) {
		this.resumeId = resumeId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Language> getLanguage() {
		return language;
	}

	public void setLanguage(List<Language> language) {
		this.language = language;
	}

	public List<Education> getEducation() {
		return Education;
	}

	public void setEducation(List<Education> education) {
		Education = education;
	}

	public List<JobExperiences> getJobExperiences() {
		return jobExperiences;
	}

	public void setJobExperiences(List<JobExperiences> jobExperiences) {
		this.jobExperiences = jobExperiences;
	}

	public List<CoverLetter> getCoverLetters() {
		return coverLetters;
	}

	public void setCoverLetters(List<CoverLetter> coverLetters) {
		this.coverLetters = coverLetters;
	}

	public List<Link> getLink() {
		return link;
	}

	public void setLink(List<Link> link) {
		this.link = link;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
	
}
