package com.booking.app.bookingapi.service.impl;

import com.booking.app.bookingapi.exception.BookingNotFoundException;
import com.booking.app.bookingapi.exception.EmptyDatabaseException;
import com.booking.app.bookingapi.models.Booking;
import com.booking.app.bookingapi.models.Itenary;
import com.booking.app.bookingapi.models.User;
import com.booking.app.bookingapi.repository.BookingRepository;
import com.booking.app.bookingapi.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> getLimitedNumOfBookings(Integer limit) {

        Pageable pageRequest = createPageRequestAssendingByCreationTime(limit);
        Page<Booking> bookingsPage = bookingRepository.findAll(pageRequest);
        if (bookingsPage.getContent().size() < 1)
            throw new EmptyDatabaseException();
        return bookingsPage.getContent();
    }

    @Override
    public List<Booking> getAllBookingByUserId(Long userId) {

        List<Booking> bookings = bookingRepository.findByUserId(userId);
        return bookings;
    }

    @Override
    public Booking getBooking(Long bookingId) {

        return bookingRepository.findById(bookingId)
                .orElseThrow(BookingNotFoundException::new);
    }

    @Override
    public User getUser(Long bookingId) {

        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(BookingNotFoundException::new);
        return booking.getUser();

    }

    @Override
    public Itenary getItenary(Long bookingId) {

        Booking booking =  bookingRepository.findById(bookingId)
                .orElseThrow(BookingNotFoundException::new);
        return booking.getItenary();
    }

    private Pageable createPageRequestAssendingByCreationTime(Integer limit){
        return PageRequest.of(0, limit, Sort.Direction.ASC, "creationTime");
    }
}
