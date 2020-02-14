package net.muroc.adsbrest.Repositories;

import net.muroc.adsbrest.domain.FlightLine;
import net.muroc.adsbrest.repositories.FlightPointRepository;
import net.muroc.adsbrest.repositories.FlightLineRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import net.muroc.adsbrest.domain.FlightPoint;
import net.muroc.adsbrest.Configuration.RepositoryConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RepositoryConfiguration.class})
public class FlightPointRepositoryTest {

    private FlightLineRepository flightLineRepository;

    @Autowired
    public void setFlightLineRepository(FlightLineRepository flightLineRepository)
    {
        this.flightLineRepository = flightLineRepository;
    }

    private FlightPointRepository flightPointRepository;

    @Autowired
    public void setFlightPointRepository(FlightPointRepository flightPointRepository)
    {
        this.flightPointRepository = flightPointRepository;
    }

    @Test
    public void saveFlightPoint()
    {
        FlightLine flightLine = new FlightLine();
        flightLine.setHex("a40cd9");
        flightLine.setSquawk("2267");
        flightLine.setFlight("SWA681");
        flightLineRepository.save(flightLine);


        FlightPoint flightPoint = new FlightPoint();
        flightPoint.setHex("a40cd9");
        flightPoint.setFlight("SWA681");
        flightPoint.setSquawk("2267");
        flightPoint.setLon(-82.827866);
        flightPoint.setLat(29.041474);
        flightPoint.setAltitude(29700);
        flightPoint.setFlight_line_id(flightLine.getFlight_id());
        flightPoint.setFlightLine(flightLine);

        flightPointRepository.save(flightPoint);
        assertNotNull(flightPoint.getFlight_pointId());

        assertEquals("SWA681",flightPoint.getFlight());
        assertEquals(-82.827866,flightPoint.getLon(),0);

    }
}
