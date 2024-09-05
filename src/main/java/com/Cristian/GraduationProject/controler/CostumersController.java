package com.Cristian.GraduationProject.controler;

import com.Cristian.GraduationProject.entity.Costumers;
import com.Cristian.GraduationProject.service.CostumersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CostumersController {

    @Autowired
    private CostumersService costumersService;

    @GetMapping("/getCostumers")
    public List getCostumers(){
        return costumersService.getAllCostumers();
    }

    @GetMapping("/getCostumer/{index}")
    public Costumers getCostumer(@PathVariable long index){
        return costumersService.getCostumerById(index);
    }

    @PostMapping("/addCostumer")
    public void addCostumer(@RequestBody Costumers costumers){
        costumersService.save(costumers);
    }

    @PutMapping("/updateCostumer")
    public void updateCostumer(@RequestBody Costumers costumers){
       costumersService.save(costumers);
    }

    @DeleteMapping("/deleteCostumer/{index}")
    public void deleteCostumer(@PathVariable long index){
        costumersService.deleteCostumers(index);
    }
}
