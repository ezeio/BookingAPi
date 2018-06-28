package com.booking.app.bookingapi.facades.impl;

import com.booking.app.bookingapi.data.BookingData;
import com.booking.app.bookingapi.facades.BookingFacade;

import java.util.List;

public class BookingFacadeImpl implements BookingFacade {


    @Override
    public List<BookingData> getLimitedNumOfBookings(Integer limit) {
        return null;
    }

    @Override
    public List<BookingData> getAllBookingsForUser(Long userId) {
        return null;
    }

    @Override
    public BookingData getBooking(Long bookingId) {
        return null;
    }

    @Override
    public BookingData getUser(Long bookingId) {
        return null;
    }

    @Override
    public BookingData getItenary(Long bookingId) {
        return null;
    }
}
