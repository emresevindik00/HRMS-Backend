package example.hrms.business.abstracts;

import java.util.List;

import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	DataResult<List<JobAdvertisement>> getAll();
	
	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>> getAllSorted();
	
	public DataResult<List<JobAdvertisement>> getByCompanyName(String companyName);
	
	DataResult<JobAdvertisement> getByjobAdvertisementId(int jobAdvertisementId);
}
