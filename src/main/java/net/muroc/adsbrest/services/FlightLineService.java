package net.muroc.adsbrest.services;

import net.muroc.adsbrest.domain.FlightLine;

public interface FlightLineService
{
    Iterable<FlightLine> listAllFlightLines();

    FlightLine getFlightLineById(Integer id);

    FlightLine saveFlightLine(FlightLine flightLine);

    void deleteFlightLine(Integer id);
}
