package com.Cristian.GraduationProject.service;

import com.Cristian.GraduationProject.entity.Supplier;
import com.Cristian.GraduationProject.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }
    public Supplier getSupplierById(long id) {
        return supplierRepository.findById(id).get();
    }
    public void saveSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
    }
    public void updateSupplier(Supplier supplier) {
        supplierRepository.save(new Supplier(supplier.getSupplier_id(),
                supplier.getSupplierName(),
                supplier.getSupplierPhone(),supplier.getSupplierEmail()
                ,supplier.getAddresses()));
    }
    public void deleteSupplierById(long id) {
        supplierRepository.deleteById(id);
    }
}
