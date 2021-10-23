package com.bridgelabz;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author :- Sunanda Shil
 * date-23/10/21
 */

public class HotelReservation {
    String hotel;
    String customer;
    //creating default constructor
    HotelReservation(){
        hotel = " ";
        customer = " ";
    }
    //creating constructor for initialize
    HotelReservation(String hotel,String customer){
        this.hotel = hotel;
        this.customer = customer;
    }
    //hotel deatails
    public void hotelDetails() {
        if (hotel == "LakeWood") {
            int rate = 110;
            System.out.println("Rate of Regular Customers of LakeWood Hotel:" + rate);
        }
        if (hotel == "BridgeWood") {
            int rate = 160;
            System.out.println("Rate of Regular Customers of BridgeWood Hotel:" + rate);
        }
        if (hotel == "RidgeWood") {
            int rate = 220;
            System.out.println("Rate of Regular Customers of RidgeWood Hotel:" + rate);
        }
    }
    //calculating and finding cheapest hotel
    public void cheapestHotel(){
        int count=0;
        count = (count+2);
        int LakeWood_Rate = 110, BridgeWood_Rate = 160, RidgeWood_Rate = 220;
        LakeWood_Rate = (LakeWood_Rate*count);
        BridgeWood_Rate = (BridgeWood_Rate*count);
        RidgeWood_Rate = (RidgeWood_Rate*count);
        if (LakeWood_Rate<BridgeWood_Rate && LakeWood_Rate<RidgeWood_Rate){
            System.out.println("LakeWood");
            System.out.println(LakeWood_Rate);
        }
        if (BridgeWood_Rate<LakeWood_Rate && BridgeWood_Rate<RidgeWood_Rate){
            System.out.println("BridgeWood");
            System.out.println(BridgeWood_Rate);
        }
        if (RidgeWood_Rate<BridgeWood_Rate && RidgeWood_Rate<LakeWood_Rate){
            System.out.println("RidgeWood");
            System.out.println(RidgeWood_Rate);
        }
    }
    public static void main(String[] args) throws Exception {
        HotelReservation hotel1 = new HotelReservation("LakeWood","Regular");
        HotelReservation hotel2 = new HotelReservation("BridgeWood","Regular");
        HotelReservation hotel3 = new HotelReservation("RidgeWood","Regular");
        hotel1.hotelDetails();
        hotel2.hotelDetails();
        hotel3.hotelDetails();
        String sDate1="10-09-2020";
        String sDate2="11-09-2020";
        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
        System.out.println(sDate1+"\t"+date1);
        System.out.println(sDate2+"\t"+date2);
        HotelReservation hotel = new HotelReservation();
        hotel.cheapestHotel();
    }
}