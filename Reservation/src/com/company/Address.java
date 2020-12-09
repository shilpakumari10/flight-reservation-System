package com.company;

public class Address {
    String addressStreet;
    String addressCity;
    String addressState;


    public Address(String addressStreet, String addressCity, String addressState){
        this.addressStreet=addressStreet;
        this.addressCity=addressCity;
        this.addressState=addressState;

    }

    public String getAddressDetails(){
        return addressStreet +", " + addressCity +", " + addressState;
    }

    public void updateAddressDetails(String addressStreet, String addressCity, String addressState){
        this.addressStreet=addressStreet;
        this.addressCity=addressCity;
        this.addressState=addressState;
    }



}
