package com.bridgelabz.addressbook.addressbook.service;

import com.bridgelabz.addressbook.addressbook.dto.AddressBook;
import com.bridgelabz.addressbook.addressbook.entity.Address;

import java.util.List;

public interface Addressbookservice {

    List<Address> getAddreeBookData();
    Address getAddressDataById(int addressID);
    Address createAddressData(AddressBook addressBook);
    Address updateAddressData(AddressBook addressBook);
    void deleteAddressData(int addressID);
}