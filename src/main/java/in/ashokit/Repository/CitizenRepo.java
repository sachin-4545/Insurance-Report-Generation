package in.ashokit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.ashokit.Entity.CitizanPlan;

@Repository
public interface CitizenRepo extends JpaRepository<CitizanPlan, Integer> {

	// it will load the plan_name data from db to front end page for dropdown
	@Query("select distinct (planName) from CitizanPlan")
	public List<String> getPlanNames();

	// it will load the plan_status data from db to front end page for dropdown
	@Query("select distinct (planStatus) from CitizanPlan")
	public List<String> getPlanStatus();
}
