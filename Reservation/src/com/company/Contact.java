package com.company;

public class Contact {
    String contactName;
    String contactPhoneNumber;
    String contactEmailId;

    public Contact( String contactName,String contactEmailId, String contactPhoneNumber){
        this.contactName=contactName;
        this.contactEmailId=contactEmailId;
        this.contactPhoneNumber=contactPhoneNumber;

    }

    public String getContactDetails(){
        return  "Name: "+contactName+", PhoneNumber: "+ contactPhoneNumber+", EmailId: "+ contactEmailId;
    }

    public void updateContactDetails(String contactName,String contactEmailId, String contactPhoneNumber){
        this.contactName=contactName;
        this.contactEmailId=contactEmailId;
        this.contactPhoneNumber=contactPhoneNumber;
    }



}
