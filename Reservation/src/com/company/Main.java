package com.company;


public class Main {

    public static void main(String[] args) {

        // CREATING OBJECTS

        Passenger passenger= new Passenger("Anjana nagar", "Mangalore","Karnataka",
                "Jenny", "586624698","jenny10@gmail.com");


        flight flight1=new flight(3278,"Indigo",100,"11.08.2020","11.08.2020","06:20","10:00");



        Ticket ticket1= new RegularTicket("Mangalore", "Delhi", "18:12:2020 06:20:49",
                "18:12:2020 10:20:00", 4000, true, true, false, flight1, passenger);

        printTicketDetails(ticket1);


    }

    //function to print Ticket details
    public  static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.statusOfTicket());
    }


    }

