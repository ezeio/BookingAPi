package com.booking.app.bookingapi.service;

import com.booking.app.bookingapi.models.Booking;
import com.booking.app.bookingapi.models.Itenary;
import com.booking.app.bookingapi.models.User;

import java.util.List;

public interface BookingService {

    List<Booking> getLimitedNumOfBookings(Integer limit);

    List<Booking> getAllBookingByUserId(Long userId);

    Booking getBooking(Long bookingId);

    User getUser(Long bookingId);

    Itenary getItenary(Long bookingId);
}
