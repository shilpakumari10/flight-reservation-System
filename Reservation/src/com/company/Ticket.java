package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class Ticket {

    //attributes of Ticket class
    public static int idCounterForPNR;
    public    int PNRNumber=101;
    private String  departureLocation;
    private String  destinationLocation;
    private float ticketPrize;
    public boolean isTicketConfirmed=false;
    public flight flight;
    public Passenger  passenger;
    public  int seatNumber=0;
    private String dateAndTimeOfDeparture;
    private String getDateAndTimeOfDestination;
    private long duration;

    //initialising static variable
    static{
        idCounterForPNR=156455;

    }

    //constructor of Ticket class
    public Ticket( String destinationLocation, String departureLocation,String dateAndTimeOfDeparture,
                   String getDateAndTimeOfDestination, float ticketPrize, flight flight, Passenger passenger){
        this.PNRNumber=++idCounterForPNR;
        this.departureLocation=departureLocation;
        this.destinationLocation=destinationLocation;
        this.ticketPrize=ticketPrize;
        this.flight=flight;
        this.passenger=passenger;
        this.dateAndTimeOfDeparture=dateAndTimeOfDeparture;
        this.getDateAndTimeOfDestination=getDateAndTimeOfDestination;
    }

    public long getDuration() {
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        try {
            Date d1 = sdf.parse(dateAndTimeOfDeparture);
            Date d2 = sdf.parse(getDateAndTimeOfDestination);
            duration = d2.getTime() - d1.getTime();
        }
        catch (ParseException e){
            System.out.println("cant find Duration");
        }
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setPNRNumber(int PNRNumber) {

        this.PNRNumber = PNRNumber;
    }

    public int getPNRNumber() {
        return PNRNumber;
    }

    public float getTicketPrize() {
        return ticketPrize;
    }

    public void setTicketPrize(float ticketPrize) {
        this.ticketPrize= ticketPrize;
    }

    public boolean isTicketConfirmed() {
        return isTicketConfirmed;
    }

    public void setTicketConfirmed(boolean ticketConfirmed) {
        isTicketConfirmed = ticketConfirmed;
    }

    public String getDateAndTimeOfDeparture() {
        return dateAndTimeOfDeparture;
    }

    public void setDateAndTimeOfDeparture(String dateAndTimeOfDeparture) {
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
    }


    public int getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }


    public String getGetDateAndTimeOfDestination() {
        return getDateAndTimeOfDestination;
    }

    public void setGetDateAndTimeOfDestination(String getDateAndTimeOfDestination) {
        this.getDateAndTimeOfDestination = getDateAndTimeOfDestination;
    }

    //Abstract Methods

   abstract String statusOfTicket();
    abstract String durationOfJourney();
   abstract String cancelTicket();




}
