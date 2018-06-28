package com.booking.app.bookingapi.service;

import com.booking.app.bookingapi.models.Booking;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserService {

    Set<Booking> getBookings(Long userId);

}
