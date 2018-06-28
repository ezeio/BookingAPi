package com.booking.app.bookingapi.controllers;

import com.booking.app.bookingapi.model.Booking;
import com.booking.app.bookingapi.model.Itenary;
import com.booking.app.bookingapi.model.User;
import com.booking.app.bookingapi.service.BookingService;
import com.booking.app.bookingapi.validation.BookingValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    BookingValidation bookingValidation;

    @GetMapping()
    public List<Booking> getLimitedNumOfBookings(@RequestParam(value = "limit") Integer limit) {
        return bookingService.getLimitedNumOfBookings(limit);
    }

    @GetMapping(value = "/users/{userId}")
    public List<Booking> getBookingsForUser(@PathVariable Long userId) {
        return bookingService.getAllBookingByUserId(userId);
    }

    @GetMapping(value = "/{bookingId}")
    public Booking getBooking(@PathVariable Long bookingId) {

        return bookingService.getBooking(bookingId);
    }

    @GetMapping(value = "/{bookingId}/user")
    public User getUser(@PathVariable Long bookingId) {
        return bookingService.getUser(bookingId);
    }

    @GetMapping(value = "/{bookingId}/itenary")
    public Itenary getItenary(@PathVariable Long bookingId) {
        return bookingService.getItenary(bookingId);
    }

}
