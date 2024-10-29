package controller;

import model.Claim;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.ClaimRepository;

import java.util.List;


@RestController
@RequestMapping("/claim")
public class ClaimController {

    @Autowired
    private ClaimRepository claimRepository;

    @GetMapping
    public List<Claim> getAllClaim(){
        return claimRepository.findAll();
    }
    @PostMapping
    public Claim createClaim(@RequestBody User claim) {
        return (Claim) claimRepository.save(claim);

}
