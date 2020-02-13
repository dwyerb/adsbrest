package net.muroc.adsbrest.services;

import net.muroc.adsbrest.domain.FlightLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.muroc.adsbrest.domain.FlightPoint;
import net.muroc.adsbrest.repositories.FlightPointRepository;
import java.sql.Timestamp;

import java.util.List;

@Service
public class FlightPointServiceImpl implements FlightPointService
{
    FlightPointRepository flightPointRepository;
    FlightLineService flightLineService;

    @Autowired
    public void setFlightPointRepository(FlightPointRepository flightPointRepository)
    {
        this.flightPointRepository = flightPointRepository;
    }

    @Autowired
    public void setFlightLineService(FlightLineService flightLineService)
    {
        this.flightLineService = flightLineService;
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

        List<FlightLine> flightLines = flightLineService.searchFlightLines(flightPoint.getHex(),flightPoint.getFlight(),flightPoint.getSquawk());
        if(flightLines.size()==0)
        {
            FlightLine flightLine = new FlightLine();
            flightLine.setSquawk(flightPoint.getSquawk());
            flightLine.setFlight(flightPoint.getFlight());
            flightLine.setHex(flightPoint.getHex());
            FlightLine returnedFlightLine = flightLineService.saveFlightLine(flightLine);

            int flight_line_id = returnedFlightLine.getFlight_id();
            flightPoint.setFlight_line_id(flight_line_id);
            flightPoint.setFlightLine(returnedFlightLine);
            flightPoint.setTimeStamp(System.currentTimeMillis());
        }
        else
        {
            FlightLine returnedFlightLine = flightLines.iterator().next();
            int flight_line_id = returnedFlightLine.getFlight_id();
            flightPoint.setFlight_line_id(flight_line_id);
            flightPoint.setFlightLine(returnedFlightLine);
            flightPoint.setTimeStamp(System.currentTimeMillis());
        }
        return flightPointRepository.save(flightPoint);
    }

    @Override
    public void deleteFlightPoint(Integer id)
    {
        flightPointRepository.deleteById(id);
    }
}
