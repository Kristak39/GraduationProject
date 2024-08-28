package com.Cristian.GraduationProject.controler;

import com.Cristian.GraduationProject.entity.Supplier;
import com.Cristian.GraduationProject.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/getAllSuppliers")
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @PostMapping("/addSupplier")
    public void addSupplier(@RequestBody Supplier supplier) {
        supplierService.saveSupplier(supplier);
    }

    @PutMapping("updateSuplier")
    public void updateSupplier(@RequestBody Supplier supplier) {
        supplierService.updateSupplier(supplier);
    }

    @GetMapping("/getSupplier/{index}")
    public Supplier getSupplier(@PathVariable int index) {
        return supplierService.getSupplierById(index);
    }

    @DeleteMapping("/deleteSupplier/{index}")
    public void deleteSupplier(@PathVariable int index) {
        supplierService.deleteSupplierById(index);
    }

}
