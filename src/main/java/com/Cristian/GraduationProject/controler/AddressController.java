package com.Cristian.GraduationProject.controler;

import com.Cristian.GraduationProject.entity.Address;
import com.Cristian.GraduationProject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/get_all_addresses")
    public List getAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/get_address_by_index/{index}")
    public Address getCostumer(@PathVariable long index){
        return addressService.getAddressById(index);
    }

    @PostMapping("/add_address")
    public void addCostumer(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @PutMapping("/update_address_by_index/{index}")
    public void updateCostumer(@PathVariable long index, @RequestBody Address address){
        addressService.updateAddress(index,address);
    }

    @DeleteMapping("/delete_address_by_index/{index}")
    public void deleteAddress(@PathVariable long index){
        addressService.deleteAddress(index);
    }
}
