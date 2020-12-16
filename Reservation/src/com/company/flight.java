package com.company;

public class flight {
    public int flightNumber;
    public String airlineOfFlight;
    public int capacity;
    public int numOfSeatsBooked;
    public String dateOfDeparture;
    public String dateOfDestination;
    public String timeOfDeparture;
    public String timeOfDestination;

        public flight(int flightNumber, String airlineOfFlight, int capacity, String dateOfDeparture,
                      String dateOfDestination,String timeOfDeparture, String timeOfDestination){
            this.flightNumber=flightNumber;
            this.airlineOfFlight=airlineOfFlight;
            this.capacity=capacity;
            this.dateOfDeparture=dateOfDeparture;
            this.dateOfDestination=dateOfDestination;
            this.timeOfDeparture=timeOfDeparture;
            this.timeOfDestination=timeOfDestination;

        }

        public flight(flight flight){
            flightNumber=flight.flightNumber;
            airlineOfFlight=flight.airlineOfFlight;
            capacity=flight.capacity;
            numOfSeatsBooked=flight.numOfSeatsBooked;
        }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumOfSeatsBooked() {
        return numOfSeatsBooked;
    }

    public void setNumOfSeatsBooked(int numOfSeatsBooked) {
        this.numOfSeatsBooked = numOfSeatsBooked;
    }

    public String getFlightDetails(){
        System.out.println("-------FLIGHT DETAILS---------");
            return "Flight number: "+ flightNumber +", Airline of flight: "+airlineOfFlight+", Capacity: " +capacity+", Number of Seats: "+numOfSeatsBooked;

        }
        public boolean checkAvailabilityOfSeats(){
            if(numOfSeatsBooked<capacity)
                return true;
            else
                return false;
        }
        public void updateNumOfSeatsBooked(){

        }


}
