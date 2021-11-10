package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import example.hrms.business.abstracts.JobAdvertisementService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessDataResult;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.JobAdvertisementDao;
import example.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(),"Tüm İş İlanları Başarıyla Listelendi!");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş İlanı Sisteme Eklendi!");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"expirationDate");
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(sort),"İlanlar Tarihe Göre Sıralandı!");
	}
	
	public DataResult<List<JobAdvertisement>> getByCompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByEmployer_CompanyName(companyName),"İlanlar Firma İsmine Göre Listelendi!");
	}

	@Override
	public DataResult<JobAdvertisement> getByjobAdvertisementId(int jobAdvertisementId) {
		return new SuccessDataResult<JobAdvertisement>
		(this.jobAdvertisementDao.getByjobAdvertisementId(jobAdvertisementId));
	}

}
