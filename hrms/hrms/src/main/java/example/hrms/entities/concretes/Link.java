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

@Table(name="links")
@Entity
public class Link {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="links_id")
	private int linkId;
	
	@Column(name="linkedin_link")
	private String linkedinLink;
	
	@JsonIgnore 
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;
	
	public Link() {
		
	}

	public Link(int linkId, String linkedinLink, Resume resume) {
		super();
		this.linkId = linkId;
		this.linkedinLink = linkedinLink;
		this.resume = resume;
	}

	public int getLinkId() {
		return linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	public String getLinkedinLink() {
		return linkedinLink;
	}

	public void setLinkedinLink(String linkedinLink) {
		this.linkedinLink = linkedinLink;
	}

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	
	
	
}
