package com.bridgelabz;

import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservation hotel1 = new HotelReservation("LakeWood","Regular");
    HotelReservation hotel2 = new HotelReservation("BridgeWood","Regular");
    HotelReservation hotel3 = new HotelReservation("RidgeWood","Regular");
    @Test
    public void toCheck_HotelDetails() {
        hotel1.hotelDetails();
        hotel2.hotelDetails();
        hotel3.hotelDetails();
    }
}
