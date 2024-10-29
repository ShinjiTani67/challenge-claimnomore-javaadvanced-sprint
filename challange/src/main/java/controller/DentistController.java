package controller;


import model.Dentist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.DentistRepository;

import java.util.List;

@RestController
@RequestMapping("/dentist")
public class DentistController {

    @Autowired
    private DentistRepository dentistRepository;

    @GetMapping
    public List<Dentist> getAllUser(){
        return dentistRepository.findAll();
    }
    @PostMapping
    public Dentist createUser(@RequestBody Dentist dentist) {
        return (Dentist) dentistRepository.save(dentist);
    }
}
