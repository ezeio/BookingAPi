package com.booking.app.bookingapi.data;

import java.time.LocalDateTime;

public class BookingData {


    private Long bookingId;
    private LocalDateTime creationTime;
    private LocalDateTime BookingModifiedTime;

    private String departure;
    private String arrival;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Boolean noneStop;

    private String firstName;
    private String lastName;

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getBookingModifiedTime() {
        return BookingModifiedTime;
    }

    public void setBookingModifiedTime(LocalDateTime bookingModifiedTime) {
        BookingModifiedTime = bookingModifiedTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
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

    public Boolean getNoneStop() {
        return noneStop;
    }

    public void setNoneStop(Boolean noneStop) {
        this.noneStop = noneStop;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
