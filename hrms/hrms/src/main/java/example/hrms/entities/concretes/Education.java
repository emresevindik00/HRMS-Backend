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


@Entity
@Table(name="educations")

public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int educationId;
	
	@Column(name="school_name")
	private String schoolName;
	
	
	@Column(name="school_department_name")
	private String schoolDepartmentName;
	
	@Column(name="entry_date")
	private Date entryDate;
	
	@Column(name="graduation_date")
	private Date graduationDate;
	
	@JsonIgnore 
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;
	

	public Education(int educationId, String schoolName, String schoolDepartmentName, Date entryDate,
			Date graduationDate, Resume resume) {
		super();
		this.educationId = educationId;
		this.schoolName = schoolName;
		this.schoolDepartmentName = schoolDepartmentName;
		this.entryDate = entryDate;
		this.graduationDate = graduationDate;
		this.resume = resume;
	}

	public Education() {
		
	}
	
	
	public int getEducationId() {
		return educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolDepartmentName() {
		return schoolDepartmentName;
	}

	public void setSchoolDepartmentName(String schoolDepartmentName) {
		this.schoolDepartmentName = schoolDepartmentName;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	
	
	
}
