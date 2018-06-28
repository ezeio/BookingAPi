package com.booking.app.bookingapi.facades.impl;

import com.booking.app.bookingapi.converters.populator.Populator;
import com.booking.app.bookingapi.data.BookingData;
import com.booking.app.bookingapi.facades.BookingFacade;
import com.booking.app.bookingapi.models.Booking;
import com.booking.app.bookingapi.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookingFacadeImpl implements BookingFacade {


    @Autowired
    Populator populator;
    @Autowired
    BookingService bookingService;

    @Override
    public List<BookingData> getLimitedNumOfBookings(Integer limit) {
        List<BookingData> bookingData = new ArrayList<>();
        List<Booking> bookings = bookingService.getLimitedNumOfBookings(limit);

        populator.populate(bookings, bookingData);

        return bookingData;
    }

    @Override
    public List<BookingData> getAllBookingsForUser(Long userId) {
        List<BookingData> bookingData = new ArrayList<>();
        List<Booking> bookings = bookingService.getAllBookingByUserId(userId);
        populator.populate(bookings, bookingData);
        return bookingData;
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
