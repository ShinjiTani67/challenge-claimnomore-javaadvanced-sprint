package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;

@Service
public class UserServiceLogic {
    @Autowired
    private UserRepository userRepository;

    @Override
    List<User> getAllUser() {
        return userRepository.findAll();
    }
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
