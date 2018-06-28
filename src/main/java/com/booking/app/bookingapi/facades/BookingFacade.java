package com.booking.app.bookingapi.facades;

import com.booking.app.bookingapi.data.BookingData;

import java.util.List;

public interface BookingFacade {
    List<BookingData> getLimitedNumOfBookings(Integer limit);
    List <BookingData> getAllBookingsForUser(Long userId);
    BookingData getBooking(Long bookingId);
    BookingData getUser(Long bookingId);
    BookingData getItenary(Long bookingId);
}
