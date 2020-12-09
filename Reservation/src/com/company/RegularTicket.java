package com.company;

public class RegularTicket {
    public String PNRNumber;
    public String departureLocation;
    public String destinationLocation;
    public flight flight;
    public float ticketPrize;
    public boolean isTicketConfirmed;
    public boolean food;
    public boolean water;
    public boolean snacks;

    public RegularTicket(String PNRNumber, String departureLocation, String destinationLocation, float prizeOfTicket,
                         boolean food, boolean water, boolean snacks){
        this.PNRNumber=PNRNumber;
        this.departureLocation=departureLocation;
        this.destinationLocation=destinationLocation;
        this.ticketPrize=prizeOfTicket;
        this.water=water;
        this.food=food;
        this.snacks=snacks;

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

    public String availedServices(){
        return "Availed Services are" + (food ?" Food":"" )+(water ?", Water":"")+ (snacks ?", Snacks":"") ;
    }

    private void updateServices(boolean _food, boolean _water, boolean _snacks){
        food=_food;
        water=_water;
        snacks=_snacks;

    }







}
