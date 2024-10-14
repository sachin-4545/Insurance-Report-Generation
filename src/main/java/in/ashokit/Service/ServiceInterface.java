package in.ashokit.Service;

import java.util.List;

import in.ashokit.Entity.CitizanPlan;
import in.ashokit.request.SearchRequest;

public interface ServiceInterface {

	public List<String>getPlanNames();
	public List<String>getPlanStatuses();
	public List<CitizanPlan> search(SearchRequest request);
	public Boolean exportPdf();
	public Boolean exportExcel();
	
	
	
}
