package in.ashokit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.Entity.CitizanPlan;
import in.ashokit.Service.ServiceImpl;
import in.ashokit.request.SearchRequest;

@Controller
public class ReportController {

	@Autowired
	private ServiceImpl service;
	
	@PostMapping("/search")
	public String handlerPage(SearchRequest request,Model model) {
		System.out.println(request);
		
		
		List<CitizanPlan> data = service.search(request);
		model.addAttribute("plans", data);
		init(model);
		return"index";
	}

	@GetMapping("/")
	public String indexPage(Model model) {
		
		
		init(model);
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("search", new SearchRequest());
		model.addAttribute("names", service.getPlanNames());
		model.addAttribute("status", service.getPlanStatuses());
	}
}
