package com.Guddu.ECommerceApp.controller;

import com.Guddu.ECommerceApp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;
    //Get
    @GetMapping("addresses")
    public List<RabbitConnectionDetails.Address> getAddresses()
    {
        return  addressService.getAddresses();
    }
    @GetMapping("address/{Id}")
    public Optional<Address> getAddress(@PathVariable Integer Id)
    {
        return addressService.getAddress(Id);
    }
    //Post
    @PostMapping("address")
    public String addAddress(@RequestBody Address address)
    {
        return addressService.addAddress(address);
    }
    @PostMapping("addresses")
    public String addListOfUsers(@RequestBody List<Address> address) {return addressService.addListOfUsers(address);}

    @DeleteMapping("address/{id}")
    public String deleteAddressById(@PathVariable Integer id){return addressService.deleteAddressById(id);}
}
