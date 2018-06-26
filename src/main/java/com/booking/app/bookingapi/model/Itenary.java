package com.booking.app.bookingapi.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Itenary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String departure;
    @Column
    private String arrival;
    @Column
    private LocalDateTime departureTime;
    @Column
    private LocalDateTime arrivalTime;
    @Column
    private boolean noneStop;
    @OneToOne(mappedBy = "itenary")
    private Booking booking;


    public String getDepature() {
        return departure;
    }

    public void setDepature(String depature) {
        this.departure = depature;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean isNoneStop() {
        return noneStop;
    }

    public void setNoneStop(boolean noneStop) {
        this.noneStop = noneStop;
    }
}
