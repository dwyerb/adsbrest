package net.muroc.adsbrest.repositories;

import net.muroc.adsbrest.domain.FlightLine;
import org.springframework.data.repository.CrudRepository;
import net.muroc.adsbrest.domain.FlightPoint;

public interface FlightPointRepository extends CrudRepository<FlightPoint, Integer>
{

}
