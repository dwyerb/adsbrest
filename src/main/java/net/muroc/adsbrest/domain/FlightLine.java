package net.muroc.adsbrest.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class FlightLine
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer flight_id;

    @OneToMany(mappedBy = "flight_line_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FlightPoint> flightPoints;

    private String hex;
    private String squawk;
    private String flightNumber;

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getSquawk() {
        return squawk;
    }

    public void setSquawk(String squawk) {
        this.squawk = squawk;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}