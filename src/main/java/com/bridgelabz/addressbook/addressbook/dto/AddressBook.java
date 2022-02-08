package com.bridgelabz.addressbook.addressbook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class AddressBook {

    private String name;
    private String emailId;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zip;

}
