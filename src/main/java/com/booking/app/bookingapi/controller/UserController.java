package com.booking.app.bookingapi.controller;

import com.booking.app.bookingapi.model.Booking;
import com.booking.app.bookingapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/users/{userId}/bookings")
    public Set<Booking> getBookings(@PathVariable Long userId) {
        return userService.getBookings(userId);
    }
}
