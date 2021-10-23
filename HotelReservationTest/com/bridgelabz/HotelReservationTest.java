package com.bridgelabz;

import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservation hotel1 = new HotelReservation("LakeWood","Regular");
    HotelReservation hotel2 = new HotelReservation("BridgeWood","Regular");
    HotelReservation hotel3 = new HotelReservation("RidgeWood","Regular");
    HotelReservation cheap_hotel = new HotelReservation();

    @Test
    public void toCheck_HotelDetails() {
        hotel1.hotelDetails();
        hotel2.hotelDetails();
        hotel3.hotelDetails();
    }
    @Test
    public void toCheck_CheapHotel() {
        cheap_hotel.cheapestHotel();
    }
}
