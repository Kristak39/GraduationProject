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

    @GetMapping("/get_all_costumers")
    public List getCostumers(){
        return costumersService.getAllCostumers();
    }

    @GetMapping("/get_costumer_by_index/{index}")
    public Costumers getCostumer(@PathVariable long index){
        return costumersService.getCostumerById(index);
    }

    @PostMapping("/add_costumer")
    public void addCostumer(@RequestBody Costumers costumers){
        costumersService.save(costumers);
    }

    @PutMapping("/update_costumer_by_index/{index}")
    public void updateCostumer(@PathVariable long index, @RequestBody Costumers costumers){
       costumersService.updateCostumers(index, costumers);
    }

    @DeleteMapping("/delete_costumer_by_index/{index}")
    public void deleteCostumer(@PathVariable long index){
        costumersService.deleteCostumers(index);
    }
}
