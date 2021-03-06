package net.muroc.adsbrest.domain;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
public class FlightPoint
{
    public Integer getFlight_pointId() {
        return flight_pointId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer flight_pointId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name="flight_id")
    private FlightLine flightLine;

    public int getFlight_line_id() {
        return flight_line_id;
    }

    public void setFlight_line_id(int flight_line_id) {
        this.flight_line_id = flight_line_id;
    }

    private int flight_line_id;

    private String hex;
    private String squawk;
    private String flight;
    private double lat;
    private double lon;
    private double nucp;
    private double seen_pos;
    private long altitude;
    private int vert_rate;
    private int track;
    private int speed;
    private int messages;

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    private long timeStamp;

    public void setFlightLine(FlightLine flightLine)
    {
        this.flightLine = flightLine;
    }
    public FlightLine getFlightLine()
    {
        return this.flightLine;
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

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getNucp() {
        return nucp;
    }

    public void setNucp(double nucp) {
        this.nucp = nucp;
    }

    public double getSeen_pos() {
        return seen_pos;
    }

    public void setSeen_pos(double seen_pos) {
        this.seen_pos = seen_pos;
    }

    public long getAltitude() {
        return altitude;
    }

    public void setAltitude(long altitude) {
        this.altitude = altitude;
    }

    public int getVert_rate() {
        return vert_rate;
    }

    public void setVert_rate(int vert_rate) {
        this.vert_rate = vert_rate;
    }

    public int getTrack() {
        return track;
    }

    public void setTrack(int track) {
        this.track = track;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMessages() {
        return messages;
    }

    public void setMessages(int messages) {
        this.messages = messages;
    }
}
