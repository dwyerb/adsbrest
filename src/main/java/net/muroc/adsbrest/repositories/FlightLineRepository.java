package net.muroc.adsbrest.repositories;

import org.springframework.data.repository.CrudRepository;
import net.muroc.adsbrest.domain.FlightLine;

import java.util.List;

public interface FlightLineRepository extends CrudRepository<FlightLine,Integer>
{
    List<FlightLine> findByHexAndFlightNumberAndSquawk(String hex, String flightNumber, String squawk);
}
