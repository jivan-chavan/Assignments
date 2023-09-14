package com.test.hotel;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Room {
    Date t;
    private int roomNumber;
    private int capacity=20;
    private float pricePerNight=1200;
    static int room=0;
    public void checkAvailability(){
        if(room!=capacity){
            System.out.println("rooms available");
        }
        else{
            System.out.println("rooms not available");
        }
    }
    public void reservation(){
        room++;
        System.out.println("room booked successfully");
    }
    public void reservation(String reserve,String Checkin,String Checkout){
        System.out.println("reserved thing "+reserve);
        room++;
        Date checkin=new Date(Checkin);
        Date checkout =new Date(Checkout);
        System.out.println("checkin: "+checkin+" checkout : "+checkout);
        System.out.println("totalcost"+(pricePerNight+200));




    }
    public void reservation(String Checkin,String Checkout){
        room++;
        Date checkin=new Date(Checkin);
        Date checkout =new Date(Checkout);
        System.out.println("checkin: "+checkin+" checkout: "+checkout);
        System.out.println("totalcost"+(pricePerNight));




    }
    @Override
    public String toString(){
        return "room"+this.roomNumber;
    }

}