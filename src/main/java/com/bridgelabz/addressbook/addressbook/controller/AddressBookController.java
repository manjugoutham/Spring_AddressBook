package com.bridgelabz.addressbook.addressbook.controller;

import com.bridgelabz.addressbook.addressbook.dto.AddressBook;
import com.bridgelabz.addressbook.addressbook.dto.Response;
import com.bridgelabz.addressbook.addressbook.entity.Address;
import com.bridgelabz.addressbook.addressbook.service.Addressbookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressBookController {


    @Autowired
    Addressbookservice addressBookService;

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<Response> getAdoreeBook(){
        List<Address> addressList =null;
        addressList = addressBookService.getAddreeBookData();
        Response response = new Response("Get call success", addressList);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @GetMapping(value = {"/get/{addressId}"})
    public ResponseEntity<Response> getAddressDataById(@PathVariable int addressId){
        Address address =null;
        address = addressBookService.getAddressDataById(addressId);
        Response response = new Response("Get call for ID success",address);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @PostMapping(value = {"/create"})
    public ResponseEntity<Response> createAddress(@RequestParam AddressBook addressBook){
        Address address =null;
        address = addressBookService.createAddressData(addressBook);
        Response response = new Response("created address book data successfully",address);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }
    @PutMapping(value = {"/update"})
    public ResponseEntity<Response> updateAddress(@RequestParam AddressBook addressBook){
        Address address =null;
        address = addressBookService.updateAddressData(addressBook);
        Response response = new Response("update address book data successfully",address);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @DeleteMapping(value = {"/delete/{personId}"})
    public ResponseEntity<Response> deleteAddress(@PathVariable int addressId){
        addressBookService.deleteAddressData(addressId);
        Response response = new Response("delete address book", "Deleted ID is"+addressId);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }
}
