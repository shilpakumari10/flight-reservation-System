package com.company;


public class Main {

    public static void main(String[] args) {

        Address address1= new Address("Vijaynagar","Bangalore","Karnataka");
           System.out.println("-------Address Details---------");
           System.out.println(address1.getAddressDetails());

        Contact contact1= new Contact("Shilpa","ynnej0895@gmail.com","123456789");
           System.out.println("-------Contact  Details------");
           System.out.println(contact1.getContactDetails());


           RegularTicket regTicket= new RegularTicket("7411","Delhi","Bangalore",2500,
                true, true, true);
            System.out.println("---------Regular Tickets-------");
            System.out.println("PNR: "+regTicket.PNRNumber);
            System.out.print("DepartureLocation: "+regTicket.departureLocation);
            System.out.println(" ,  DestinationLocation: "+regTicket.destinationLocation);
            System.out.println(regTicket.availedServices());
            System.out.println("TicketConfirmed: "+regTicket.isTicketConfirmed);



        TouristTicket tourTicket= new TouristTicket("9864","Mumbai","Patna",5000," Taj, VayuVihar");
        System.out.println("---------Get TouristTicket Details------------");
        System.out.println("PNR: "+regTicket.PNRNumber);
        System.out.print("DepartureLocation: "+regTicket.departureLocation);
        System.out.println(" ,  DestinationLocation: "+regTicket.destinationLocation);
        System.out.println("Prize: "+ tourTicket.ticketPrize);
        System.out.println("HotelAddress:"+tourTicket.touristHotelAddress );
        System.out.println("TicketConfirmed: "+tourTicket.StatusOfTicket(true));

        flight flight=new flight(8548,"GoAir",120,"09/12/2020", "09/12/2020",
                "6:20","9:10");
        System.out.println("---------Get Flight Details------------");
        System.out.println(flight.getFlightDetails());
        System.out.println("Availability: "+flight.checkAvailabilityOfSeats());





    }
}
