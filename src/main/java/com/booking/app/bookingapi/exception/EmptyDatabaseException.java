package com.booking.app.bookingapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "There are no records in the database")
public class EmptyDatabaseException extends RuntimeException {}
