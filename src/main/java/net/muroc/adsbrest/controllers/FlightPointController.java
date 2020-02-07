package net.muroc.adsbrest.controllers;

import net.muroc.adsbrest.domain.FlightPoint;
import net.muroc.adsbrest.repositories.FlightPointRepository;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="/flightpoint")
public class FlightPointController
{
    @Autowired
    private FlightPointRepository flightPointRepository;

    @GetMapping(path="/points")
    public @ResponseBody Iterable<FlightPoint> getFlightPoints()
    {
        return flightPointRepository.findAll();
    }
}
