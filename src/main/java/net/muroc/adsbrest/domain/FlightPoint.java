package net.muroc.adsbrest.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class FlightPoint
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer flight_pointId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name="flight_id")
    private FlightLine flightLine;

    private int flight_line_id;
    private String hex;
    private String squawk;
    private String flight_number;
    private double lat;
    private double lon;
    private double nucp;
    private double seen_pos;
    private long altitude;
    private int vert_rate;
    private int track;
    private int speed;
    private int messages;
    private Timestamp timeStamp;


}
