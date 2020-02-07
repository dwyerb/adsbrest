package net.muroc.adsbrest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.muroc.adsbrest.domain.FlightPoint;
import net.muroc.adsbrest.repositories.FlightPointRepository;

@Service
public class FlightPointServiceImpl implements FlightPointService
{
    FlightPointRepository flightPointRepository;

    @Autowired
    public void setFlightPointRepository(FlightPointRepository flightPointRepository)
    {
        this.flightPointRepository = flightPointRepository;
    }

    @Override
    public Iterable<FlightPoint> listAllFlightPoints()
    {
        return flightPointRepository.findAll();
    }

    @Override
    public FlightPoint getFlightPointById(Integer id)
    {
        return flightPointRepository.findById(id).orElse(null);
    }

    @Override
    public FlightPoint saveFlightPoint(FlightPoint flightPoint)
    {
        return flightPointRepository.save(flightPoint);
    }

    @Override
    public void deleteFlightPoint(Integer id)
    {
        flightPointRepository.deleteById(id);
    }
}
