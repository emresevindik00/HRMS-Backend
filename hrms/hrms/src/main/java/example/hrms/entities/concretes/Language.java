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


@Table(name="languages")
@Entity
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="language_id")
	private int languageId;
	
	@Column(name="language_name")
	private String languageName;
	
	@Column(name="language_level")
	private String languageLevel;
	
	@JsonIgnore 
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;
	
	public Language() {
		
	}

	public Language(int languageId, String languageName, String languageLevel, Resume resume) {
		super();
		this.languageId = languageId;
		this.languageName = languageName;
		this.languageLevel = languageLevel;
		this.resume = resume;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageLevel() {
		return languageLevel;
	}

	public void setLanguageLevel(String languageLevel) {
		this.languageLevel = languageLevel;
	}

	
	
	

}
