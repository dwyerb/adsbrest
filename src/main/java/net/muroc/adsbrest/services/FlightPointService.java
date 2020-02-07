package net.muroc.adsbrest.services;

import net.muroc.adsbrest.domain.FlightPoint;


public interface FlightPointService
{
    Iterable<FlightPoint> listAllFlightPoints();

    FlightPoint getFlightPointById(Integer id);

    FlightPoint saveFlightPoint(FlightPoint flightPoint);

    void deleteFlightPoint(Integer id);
}
