package net.muroc.adsbrest.services;

import net.muroc.adsbrest.domain.FlightLine;

import java.util.List;

public interface FlightLineService
{
    Iterable<FlightLine> listAllFlightLines();

    FlightLine getFlightLineById(Integer id);

    FlightLine saveFlightLine(FlightLine flightLine);

    void deleteFlightLine(Integer id);

    List<FlightLine> searchFlightLines(String hex, String flight, String squawk);
}
