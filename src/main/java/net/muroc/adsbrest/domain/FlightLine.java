package net.muroc.adsbrest.domain;

import javax.persistence.*;
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
    private String flight;

    public Integer getFlight_id() {
        return flight_id;
    }

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

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }
}
