package net.muroc.adsbrest.repositories;

import org.springframework.data.repository.CrudRepository;
import net.muroc.adsbrest.domain.FlightLine;

public interface FlightLineRepository extends CrudRepository<FlightLine,Integer>
{
}
