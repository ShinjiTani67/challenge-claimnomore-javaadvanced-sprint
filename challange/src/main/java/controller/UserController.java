package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.UserRepository;

import java.util.List;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    @PostMapping
    public User createUser(@RequestBody User user) {
        return (User) userRepository.save(user);
    }

}
