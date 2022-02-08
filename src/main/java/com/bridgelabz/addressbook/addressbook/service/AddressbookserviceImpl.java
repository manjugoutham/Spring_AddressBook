package com.bridgelabz.addressbook.addressbook.service;

import com.bridgelabz.addressbook.addressbook.dto.AddressBook;
import com.bridgelabz.addressbook.addressbook.entity.Address;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressbookserviceImpl implements Addressbookservice{

    @Override
    public List<Address> getAddreeBookData() {
        List<Address> addressArrayList  = new ArrayList<>();
        addressArrayList.add(new Address(1,new AddressBook("Goutham","gouthu12@gmail.com","8105457612","Hebal","Kolar","Andrapradesh","550066")));
        return addressArrayList;
    }
    @Override
    public Address getAddressDataById(int addressID) {
        Address addressArrayList  = null;
        addressArrayList = new Address(2,new AddressBook("Allu","aaaaa@gmail.com","8876533432","MG Road","Banglore","Karnataka","560052"));
        if (addressID==addressArrayList.getAddressId()){
            return addressArrayList;
        }
        return null;
    }
    @Override
    public Address createAddressData(AddressBook addressBook) {
        Address address = null;
        address = new Address(1,addressBook);
        return address;
    }

    @Override
    public Address updateAddressData(AddressBook addressBook) {
        Address address = null;
        address = new Address(1,addressBook);
        return address;
    }

    @Override
    public void deleteAddressData(int addressID) {
        System.out.println( addressID +" No data found");
    }

}