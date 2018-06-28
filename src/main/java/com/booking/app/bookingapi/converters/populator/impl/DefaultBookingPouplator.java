package com.booking.app.bookingapi.converters.populator.impl;

import com.booking.app.bookingapi.converters.populator.Populator;
import com.booking.app.bookingapi.data.BookingData;
import com.booking.app.bookingapi.exception.BookingNotFoundException;
import com.booking.app.bookingapi.models.Booking;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DefaultBookingPouplator implements Populator<Booking,BookingData> {

    @Override
    public BookingData populate(Booking source, BookingData target) {

        Booking booking = Optional.of(source)
                .orElseThrow(BookingNotFoundException::new);

        target.setBookingId(booking.getBookingId());
        target.setCreationTime(booking.getCreationTime());
        target.setDeparture(booking.getItenary().getDeparture());
        target.setArrival(booking.getItenary().getArrival());
        target.setDepartureTime(booking.getItenary().getDepartureTime());
        target.setArrivalTime(booking.getItenary().getArrivalTime());
        target.setNoneStop(booking.getItenary().isNoneStop());
        target.setFirstName(booking.getUser().getFirstName());
        target.setLastName(booking.getUser().getLastName());

        return target;
    }

    @Override
    public void populate(List<Booking> bookings, List<BookingData> bookingData) {
        bookings.forEach(booking -> bookingData.add(populate(booking, new BookingData())));
    }
}
