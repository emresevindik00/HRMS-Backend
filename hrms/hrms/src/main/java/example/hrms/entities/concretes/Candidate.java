package example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="candidates")
@Entity 
public class Candidate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="candidates_id")
	private int candidatesId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	

	public Candidate(int candidatesId, String firstName, String lastName, String identityNumber) {
		super();
		this.candidatesId = candidatesId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
	}
	
	public Candidate() {
		
	}

	public int getCandidatesId() {
		return candidatesId;
	}

	public void setCandidatesId(int candidatesId) {
		this.candidatesId = candidatesId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	
	
	
}

