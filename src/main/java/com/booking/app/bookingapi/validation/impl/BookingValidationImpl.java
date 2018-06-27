package com.booking.app.bookingapi.validation.impl;

import com.booking.app.bookingapi.validation.BookingValidation;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookingValidationImpl implements BookingValidation {

    @Override
    public boolean isvalId(Long bookingId) {
        return Optional.of(bookingId).isPresent();
    }
}
