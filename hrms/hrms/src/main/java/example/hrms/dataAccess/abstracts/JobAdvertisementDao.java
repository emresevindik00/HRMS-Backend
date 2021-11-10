package example.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	List<JobAdvertisement>  getByEmployer_CompanyName(String companyName);
	
	JobAdvertisement  getByjobAdvertisementId(int id);
}
