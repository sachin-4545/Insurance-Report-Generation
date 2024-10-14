package in.ashokit.Service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.ashokit.Entity.CitizanPlan;
import in.ashokit.Repository.CitizenRepo;
import in.ashokit.request.SearchRequest;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	private CitizenRepo repo;

	@Override
	public List<String> getPlanNames() {

		List<String> planNames = repo.getPlanNames();
		return planNames;
	}

	@Override
	public List<String> getPlanStatuses() {

		List<String> planStatus = repo.getPlanStatus();
		return planStatus;
	}

	@Override
	public List<CitizanPlan> search(SearchRequest request) {
		CitizanPlan entity = new CitizanPlan();// for dynamic query we need QBE an for that we need entity class here we
												// copied form data into entity class
		// BeanUtils.copyProperties(request, entity);

		if (null != request.getPlanName() && !" ".equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		}
		if (null != request.getPlanStatus() && !" ".equals(request.getPlanName())) {
			entity.setPlanStatus(request.getPlanStatus());
		}

		if (null != request.getGender() && !" ".equals(request.getGender())) {
			entity.setGender(request.getGender());
		}

		return repo.findAll(Example.of(entity));
	}

	@Override
	public Boolean exportPdf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean exportExcel() {
		// TODO Auto-generated method stub
		return null;
	}

}
