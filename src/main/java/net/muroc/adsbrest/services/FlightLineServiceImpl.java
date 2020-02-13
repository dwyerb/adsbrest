package net.muroc.adsbrest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.muroc.adsbrest.domain.FlightLine;
import net.muroc.adsbrest.repositories.FlightLineRepository;

import java.util.List;


@Service
public class FlightLineServiceImpl implements FlightLineService
{
    FlightLineRepository flightLineRepository;

    @Autowired
    public void setFlightLineRepository(FlightLineRepository flightLineRepository)
    {
        this.flightLineRepository = flightLineRepository;
    }

    @Override
    public Iterable<FlightLine> listAllFlightLines()
    {
        return flightLineRepository.findAll();
    }

    @Override
    public FlightLine getFlightLineById(Integer id)
    {
        return flightLineRepository.findById(id).orElse(null);
    }

    @Override
    public FlightLine saveFlightLine(FlightLine flightLine)
    {
        return flightLineRepository.save(flightLine);
    }

    @Override
    public void deleteFlightLine(Integer id)
    {
        flightLineRepository.deleteById(id);
    }

    @Override
    public List<FlightLine> searchFlightLines(String hex, String flightNumber, String squawk)
    {
        return flightLineRepository.findByHexAndFlightNumberAndSquawk(hex,flightNumber,squawk);
    }
}