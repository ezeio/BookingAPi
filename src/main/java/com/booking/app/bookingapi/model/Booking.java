package com.booking.app.bookingapi.model;

import java.time.LocalDateTime;

public class Booking {

    private Long bookingNum;
    private User user;
    private Itenary itenary;
    private LocalDateTime creationTime;
    private LocalDateTime modifiedTime;


    public Long getBookingNum() {
        return bookingNum;
    }

    public void setBookingNum(Long bookingNum) {
        this.bookingNum = bookingNum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Itenary getItenary() {
        return itenary;
    }

    public void setItenary(Itenary itenary) {
        this.itenary = itenary;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
