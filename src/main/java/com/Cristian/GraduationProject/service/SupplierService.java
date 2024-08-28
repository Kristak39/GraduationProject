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
    public Supplier getSupplierById(int id) {
        return supplierRepository.findById(id).get();
    }
    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }
    public Supplier updateSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }
    public void deleteSupplierById(int id) {
        supplierRepository.deleteById(id);
    }
}
