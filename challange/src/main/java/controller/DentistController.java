package controller;

import dto.DentistDto;
import model.Dentist;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.DentistRepository;
import repository.UserRepository;
import service.DentistService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
