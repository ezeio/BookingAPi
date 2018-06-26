package com.booking.app.bookingapi.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingNum;
    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;
    @OneToOne()
    @JoinColumn
    private Itenary itenary;
    @Column
    private LocalDateTime creationTime;
    @Column
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
