package com.Cristian.GraduationProject.controler;

import com.Cristian.GraduationProject.entity.Address;
import com.Cristian.GraduationProject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController()
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/getAddresses")
    public List getAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/getAddress/{index}")
    public Address getCostumer(@PathVariable long index){
        return addressService.getAddressById(index);
    }

    @PostMapping("/addCostumer")
    public void addCostumer(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @PutMapping("/updateAddress/{index}")
    public void updateCostumer(@PathVariable long index, @RequestBody Address address){
        addressService.updateAddress(index,address);
    }

    @DeleteMapping("/deleteCostumer/{index}")
    public void deleteAddress(@PathVariable long index){
        addressService.deleteAddress(index);
    }
}
