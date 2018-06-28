package com.booking.app.bookingapi.repository;

import com.booking.app.bookingapi.models.Booking;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends PagingAndSortingRepository<Booking,Long> {

    List<Booking> findByUserId(Long userId);
}
