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

@Table(name="positions")
@Entity
public class Position {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="position_id")
	private int id;
	
	@Column(name="title")
	private String position;
	
	@JsonIgnore 
	@OneToMany(mappedBy="position")
	private List<JobAdvertisement> jobAdvertisements;
	
	public Position() {
		
	}
	
	public Position(int id, String position, List<JobAdvertisement> jobAdvertisements) {
		super();
		this.id = id;
		this.position = position;
		this.jobAdvertisements = jobAdvertisements;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
