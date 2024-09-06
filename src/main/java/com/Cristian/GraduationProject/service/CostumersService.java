package com.Cristian.GraduationProject.service;

import com.Cristian.GraduationProject.entity.Costumers;
import com.Cristian.GraduationProject.repository.CostumersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostumersService {

    @Autowired
    private CostumersRepository costumersRepository;

    public List<Costumers> getAllCostumers(){
        return costumersRepository.findAll();
    }
    public Costumers getCostumerById(long id){
        return costumersRepository.findById(id).get();
    }

    public void save(Costumers costumers){
        costumersRepository.save(costumers);
    }

    public void updateCostumers(Costumers costumers){
        costumersRepository.save(new Costumers(costumers.getCostumerId(),
                costumers.getFirstName(),
                costumers.getLastName(),
                costumers.getEmail(),
                costumers.getPhone(),
                costumers.getAddresses(),
                costumers.getProducts()));
    }

    public void deleteCostumers(long id){
        costumersRepository.deleteById(id);
    }
}
