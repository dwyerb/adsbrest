package net.muroc.adsbrest.controllers;

import net.muroc.adsbrest.domain.FlightPoint;
import net.muroc.adsbrest.repositories.FlightPointRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="/flightpoint")
public class FlightPointController
{
    @Autowired
    private FlightPointRepository flightPointRepository;

    @GetMapping(path="/points")
    public @ResponseBody Iterable<FlightPoint> getFlightPoints()
    {
        return flightPointRepository.findAll();
        //return flightPointRepository.count();
    }

    @GetMapping(path="/count")
    public @ResponseBody long getFlightPointCount()
    {
        return flightPointRepository.count();
    }

    @PostMapping(path="/points/new")
    public FlightPoint saveNewFlightLine(@RequestBody FlightPoint flightPoint)
    {
        return flightPointRepository.save(flightPoint);
    }
}
