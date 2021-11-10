package example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.hrms.business.abstracts.LinkService;
import example.hrms.core.utilities.results.DataResult;
import example.hrms.core.utilities.results.Result;
import example.hrms.core.utilities.results.SuccessDataResult;
import example.hrms.core.utilities.results.SuccessResult;
import example.hrms.dataAccess.abstracts.LinkDao;
import example.hrms.entities.concretes.Link;

@Service
public class LinkManager implements LinkService{
	private LinkDao linkDaO;
	
	@Autowired
	public LinkManager(LinkDao linkDaO) {
		super();
		this.linkDaO = linkDaO;
	}

	@Override
	public DataResult<List<Link>> getAll() {
		return new SuccessDataResult<List<Link>>
		(this.linkDaO.findAll(),"Dil Geldi!");
	}

	@Override
	public Result add(Link link) {
		this.linkDaO.save(link);
		return new SuccessResult("Dil Başarıyla Eklendi!");
	}

	@Override
	public DataResult<Link> findByResume_ResumeId(int id) {
		return new SuccessDataResult<Link>
		(this.linkDaO.findByResume_ResumeId(id),"Dil Geldi!");
	}

	

	
	
}
