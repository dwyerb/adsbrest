package net.muroc.adsbrest.controllers;

import net.muroc.adsbrest.domain.FlightLine;
import net.muroc.adsbrest.repositories.FlightLineRepository;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import net.muroc.adsbrest.services.FlightLineService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="/flightline")
public class FlightLineController
{
    @Autowired
    private FlightLineService flightLineService;

    @GetMapping("flights/{flight_id}/flightline")
    public FlightLine retrieveFlightLines(@PathVariable int flight_id)
    {
        return flightLineService.getFlightLineById(flight_id);
    }

    @GetMapping("flights")
    public Iterable<FlightLine> retrieveAllFlightLines()
    {
        return flightLineService.listAllFlightLines();
    }

    @PostMapping("flights/new")
    public FlightLine saveNewFlightLine(@RequestBody FlightLine flightLine)
    {
        return flightLineService.saveFlightLine(flightLine);
    }
}
