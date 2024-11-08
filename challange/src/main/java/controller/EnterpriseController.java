package controller;


import model.Enterprise;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.EnterpriseRepository;
import repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    @GetMapping
    public List<Enterprise> getAllUser() {
        return enterpriseRepository.findAll();
    }

    @PostMapping
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise) {
        return (Enterprise) enterpriseRepository.save(enterprise);
    }
}