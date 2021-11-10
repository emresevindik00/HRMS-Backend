package example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Table(name="cover_letters")
@Entity

public class CoverLetter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cover_letters_id")
	private int coverLetterId;
	
	@Column(name="summary")
	private String summary;
	
	@JsonIgnore 
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;
	

	public CoverLetter(int coverLetterId, String summary, Resume resume) {
		super();
		this.coverLetterId = coverLetterId;
		this.summary = summary;
		this.resume = resume;
	}
	
	public CoverLetter() {
		
	}

	public int getCoverLetterId() {
		return coverLetterId;
		
	}

	public void setCoverLetterId(int coverLetterId) {
		this.coverLetterId = coverLetterId;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	
}
