package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hong on 2017-07-09.
 */
@Component
public class DatabaseSeeder implements CommandLineRunner { // initialize
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<HotelBooking> bookings = new ArrayList<>();

        bookings.add(new HotelBooking("A", 200.50, 3));
        bookings.add(new HotelBooking("B", 90, 4));
        bookings.add(new HotelBooking("C", 140.74, 1));

        bookingRepository.save(bookings);
    }
}
