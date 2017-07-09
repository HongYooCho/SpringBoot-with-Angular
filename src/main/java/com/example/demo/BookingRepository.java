package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hong on 2017-07-09.
 */
@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long>{
    List<HotelBooking> findByPricePerNightLessThan(double price);
}
