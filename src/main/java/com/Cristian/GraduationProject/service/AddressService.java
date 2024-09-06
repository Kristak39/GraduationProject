package com.Cristian.GraduationProject.service;

import com.Cristian.GraduationProject.entity.Address;
import com.Cristian.GraduationProject.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.datatransfer.DataFlavor;
import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses(){
        return addressRepository.findAll();
    }

    public Address getAddressById(long id) {
        return addressRepository.findById(id).get();
    }
    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public void updateAddress(Address address) {
        addressRepository.save(new Address(address.getAddress_id(),
                address.getStreet(),
                address.getCity(),
                address.getState(),
                address.getZip(),
                address.getCountry()));
    }

    public void deleteAddress(long id) {
        addressRepository.deleteById(id);
    }
}
