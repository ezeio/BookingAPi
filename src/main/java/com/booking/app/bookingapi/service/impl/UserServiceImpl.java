package com.booking.app.bookingapi.service.impl;

import com.booking.app.bookingapi.exception.BookingNotFoundException;
import com.booking.app.bookingapi.model.Booking;
import com.booking.app.bookingapi.model.User;
import com.booking.app.bookingapi.repository.UserRepository;
import com.booking.app.bookingapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Set<Booking> getBookings(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(BookingNotFoundException::new);
        return user.getBookings();
    }
}
