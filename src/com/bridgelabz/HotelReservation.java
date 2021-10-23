package com.bridgelabz;

/**
 * Author :- Sunanda Shil
 * date-23/10/21
 *
 */

public class HotelReservation {
    String hotel;
    String customer;
    //Creating constructor for initialize
    HotelReservation(String hotel,String customer){
        this.hotel = hotel;
        this.customer = customer;
    }
    //creating method for adding hotels
    public void hotelDetails(){
        if (hotel == "LakeWood"){
            int rate = 110;
            System.out.println("Rate of Regular Customers of LakeWood Hotel:"+rate);
        }
        if (hotel == "BridgeWood"){
            int rate = 160;
            System.out.println("Rate of Regular Customers of BridgeWood Hotel:"+rate);
        }
        if (hotel == "RidgeWood"){
            int rate = 220;
            System.out.println("Rate of Regular Customers of RidgeWood Hotel:"+rate);
        }
    }
    //Main method created for calling
    public static void main(String[] args){
        HotelReservation hotel1 = new HotelReservation("LakeWood","Regular");
        HotelReservation hotel2 = new HotelReservation("BridgeWood","Regular");
        HotelReservation hotel3 = new HotelReservation("RidgeWood","Regular");
        hotel1.hotelDetails();
        hotel2.hotelDetails();
        hotel3.hotelDetails();
    }
}
