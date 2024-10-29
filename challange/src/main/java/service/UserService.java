package service;


import model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUser();
    User createUser(User user);
    Optional<User> getUserById(Long id);
    User updateUser(long id, User userDetails);
    void deleteUser(Long id);
}
