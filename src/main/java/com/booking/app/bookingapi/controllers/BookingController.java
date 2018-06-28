package com.booking.app.bookingapi.controllers;

import com.booking.app.bookingapi.data.BookingData;
import com.booking.app.bookingapi.facades.BookingFacade;
import com.booking.app.bookingapi.models.Booking;
import com.booking.app.bookingapi.models.Itenary;
import com.booking.app.bookingapi.models.User;
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
    BookingFacade bookingFacade;

    @Autowired
    BookingValidation bookingValidation;

    @GetMapping()
    public List<BookingData> getLimitedNumOfBookings(@RequestParam(value = "limit") Integer limit) {
        return bookingFacade.getLimitedNumOfBookings(limit);
    }

    @GetMapping(value = "/users/{userId}")
    public List<BookingData> getBookingsForUser(@PathVariable Long userId) {
        return bookingFacade.getAllBookingsForUser(userId);
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
