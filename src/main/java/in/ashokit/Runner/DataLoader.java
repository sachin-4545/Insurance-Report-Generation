package in.ashokit.Runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.Entity.CitizanPlan;
import in.ashokit.Repository.CitizenRepo;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private CitizenRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		repo.deleteAll();// it will delete the previous record 
		
		// cash plan data
		CitizanPlan c1 = new CitizanPlan();
		c1.setCitizenName("Sam");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenifitamt(5000.00);

		CitizanPlan c2 = new CitizanPlan();
		c2.setCitizenName("Tom");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenielReason("Rental Income");

		CitizanPlan c3 = new CitizanPlan();
		c3.setCitizenName("cathy");
		c3.setGender("Female");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationReason("Employeed");
		c3.setBenifitamt(5000.00);

		// food plan data
		CitizanPlan c4 = new CitizanPlan();
		c4.setCitizenName("Buttler");
		c4.setGender("Male");
		c4.setPlanName("food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenifitamt(5000.00);

		CitizanPlan c5 = new CitizanPlan();
		c5.setCitizenName("ismail");
		c5.setGender("Female");
		c5.setPlanName("food");
		c5.setPlanStatus("Denied");
		c5.setDenielReason("Rental Income");

		CitizanPlan c6 = new CitizanPlan();
		c6.setCitizenName("smith");
		c6.setGender("Male");
		c6.setPlanName("food");
		c6.setPlanStatus("Terminated");
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationReason("Employeed");
		c6.setBenifitamt(5000.00);

		// medical plan data
		CitizanPlan c7 = new CitizanPlan();
		c7.setCitizenName("Maxwell");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenifitamt(5000.00);

		CitizanPlan c8 = new CitizanPlan();
		c8.setCitizenName("shobna");
		c8.setGender("Female");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setDenielReason("Rental Income");

		CitizanPlan c9 = new CitizanPlan();
		c9.setCitizenName("salt");
		c9.setGender("Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminationReason("Employeed");
		c9.setBenifitamt(5000.00);

		// Employement plan data
		CitizanPlan c10 = new CitizanPlan();
		c10.setCitizenName("stonis");
		c10.setGender("Male");
		c10.setPlanName("Employement");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenifitamt(5000.00);

		CitizanPlan c11 = new CitizanPlan();
		c11.setCitizenName("alika");
		c11.setGender("Female");
		c11.setPlanName("Employement");
		c11.setPlanStatus("Denied");
		c11.setDenielReason("Rental Income");

		CitizanPlan c12 = new CitizanPlan();
		c12.setCitizenName("narin");
		c12.setGender("male");
		c12.setPlanName("Employement");
		c12.setPlanStatus("Terminated");
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminationReason("Employeed");
		c12.setBenifitamt(5000.00);

		List<CitizanPlan> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12);
		repo.saveAll(list);
	}

}
