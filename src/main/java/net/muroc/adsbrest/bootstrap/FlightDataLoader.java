package net.muroc.adsbrest.bootstrap;

import net.muroc.adsbrest.domain.FlightPoint;
import net.muroc.adsbrest.domain.FlightLine;
import net.muroc.adsbrest.repositories.FlightPointRepository;
import net.muroc.adsbrest.repositories.FlightLineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class FlightDataLoader implements ApplicationListener<ContextRefreshedEvent>
{

    private FlightPointRepository flightPointRepository;
    private FlightLineRepository flightLineRepository;

    @Autowired
    public void setFlightLineRepository(FlightLineRepository flightLineRepository)
    {
        this.flightLineRepository = flightLineRepository;
    }

    @Autowired
    public void setFlightPointRepository(FlightPointRepository flightPointRepository)
    {
        this.flightPointRepository = flightPointRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event)
    {
        String fl_flightNumber = "AAY772";
        String fl_Hex = "a35e5b";
        String fl_Squawk = "abcd1234";
        double fl_lat = 28.223225;
        double fl_lon = -82.703032;

        FlightLine flightLine = new FlightLine();
        flightLine.setHex(fl_Hex);
        flightLine.setFlight(fl_flightNumber);
        flightLine.setSquawk(fl_Squawk);

        flightLineRepository.save(flightLine);

        FlightPoint flightPoint = new FlightPoint();

        flightPoint.setHex(fl_Hex);
        flightPoint.setSquawk(fl_Squawk);
        flightPoint.setAltitude(14000);
        flightPoint.setLat(fl_lat);
        flightPoint.setLon(fl_lon);
        flightPoint.setFlight_line_id(flightLine.getFlight_id());
        flightPoint.setFlightLine(flightLine);

        flightPointRepository.save(flightPoint);

    }

}
