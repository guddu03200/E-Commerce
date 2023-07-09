package com.Guddu.ECommerceApp.service;

import com.Guddu.ECommerceApp.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "Address added";
    }

    public List<Address> getAddresses() {
        return ( List<Address>) iAddressRepo.findAll();
    }

    public Optional<Address> getAddress(Integer id) {
        return iAddressRepo.findById(id);
    }

    public String addListOfUsers(List<Address> address) {
        iAddressRepo.saveAll(address);

        return "Addresses Added!!!";
    }

    public String deleteAddressById(Integer id) {
        iAddressRepo.deleteById(id);

        return "Address removed";
    }
}