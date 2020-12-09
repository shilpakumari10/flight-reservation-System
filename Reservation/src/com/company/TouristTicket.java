package com.company;

public class TouristTicket {
    public String PNRNumber;
    public String departureLocation;
    public String destinationLocation;
    public flight flight;
    public float ticketPrize;
    public boolean isTicketConfirmed;
    public String touristHotelAddress;
    public String[] touristLocations= new String[4];
    public int countOfTouristLocations;

    public TouristTicket(String PNRNumber, String departureLocation, String destinationLocation, float prizeOfTicket, String touristHotelAddress){
        this.PNRNumber=PNRNumber;
        this.departureLocation=departureLocation;
        this.destinationLocation=destinationLocation;
        this.ticketPrize=prizeOfTicket;
        this.touristHotelAddress=touristHotelAddress;

    }

    public String StatusOfTicket(boolean isTicketConfirmed){
        if (isTicketConfirmed)
            return "Confirmed";
        else
            return "Cancelled";
    }

    public void cancelTicket(){
        isTicketConfirmed=false;
    }

    public void addTouristLocation(String location){
        for(int i=0;i<5;i++){
            if(touristLocations[i]==null){
                touristLocations[i]=location;
                countOfTouristLocations--;
                break;
            }
            else{
                System.out.print("Cant add location");
            }
        }
    }

    public void removeLocation(String location) {
        for (int i = 0; i < 5; i++) {
            if (touristLocations[i].equals(location)) {
                touristLocations[i] = null;
                countOfTouristLocations++;
                break;
            }
        }
    }
}
