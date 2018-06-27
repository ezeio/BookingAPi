package com.booking.app.bookingapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Booking not found for the provided id")
public class BookingNotFoundException extends RuntimeException {
    public BookingNotFoundException(){}
}
