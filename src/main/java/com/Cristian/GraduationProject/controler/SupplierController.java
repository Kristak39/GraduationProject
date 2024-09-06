package com.Cristian.GraduationProject.controler;

import com.Cristian.GraduationProject.entity.Supplier;
import com.Cristian.GraduationProject.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/get_all_suppliers")
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/add-supplier")
    public void addSupplier(@RequestBody Supplier supplier) {
        supplierService.saveSupplier(supplier);
    }

    @PutMapping("/update_supplier_by_index/{index}")
    public void updateSupplier(@PathVariable long index,@RequestBody Supplier supplier) {
        supplierService.updateSupplier(index, supplier);
    }

    @GetMapping("/get_supplier_by_index/{index}")
    public Supplier getSupplier(@PathVariable long index) {
        return supplierService.getSupplierById(index);
    }

    @DeleteMapping("/delete_supplier_by_index/{index}")
    public void deleteSupplier(@PathVariable long index) {
        supplierService.deleteSupplierById(index);
    }

}
