package com.bridgelabz.addressbook.addressbook.entity;

import com.bridgelabz.addressbook.addressbook.dto.AddressBook;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private long addressId;
    private String name;
    private String emailId;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zip;

    public Address(long addressId, AddressBook addressBook){
        this.addressId=addressId;
        this.name=addressBook.getName();
        this.emailId=addressBook.getEmailId();
        this.phoneNumber=addressBook.getPhoneNumber();
        this.address=addressBook.getAddress();
        this.city=addressBook.getCity();
        this.state=addressBook.getState();
        this.zip = addressBook.getZip();
    }
}
