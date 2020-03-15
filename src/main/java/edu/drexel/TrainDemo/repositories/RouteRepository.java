package edu.drexel.TrainDemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.drexel.TrainDemo.models.Route;

public interface RouteRepository extends CrudRepository<Route, Long> {
	List<Route> findByAgency_Id(long agencyId);

	@Query(value = "select distinct r.id, r.name,r.agency_id,r.external_url,r.route_type from Route r join Trip t on r.id=t.route_id join Stop_Time st on t.id=st.trip_id join Stop s on st.stop_id=s.id where s.id in (?1,?2)", nativeQuery = true)
//	List<Route> findOneway(String source, String destination, String date, String name, int adult, int seniorCitizen,
//			int children, int infant);
	List<Route> findOneway(@Param("source") String source, @Param("destination") String destination);
}