package net.muroc.adsbrest.controllers;

import net.muroc.adsbrest.domain.FlightPoint;
import net.muroc.adsbrest.services.FlightPointService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="/flightpoint")
public class FlightPointController
{
    @Autowired
    private FlightPointService flightPointService;

    @GetMapping(path="/points")
    public @ResponseBody Iterable<FlightPoint> getFlightPoints()
    {
        //return flightPointRepository.findAll();
        return flightPointService.listAllFlightPoints();

    }


    @PostMapping(path="/points/new")
    public FlightPoint saveNewFlightLine(@RequestBody FlightPoint flightPoint)
    {
        return flightPointService.saveFlightPoint(flightPoint);
    }
}
