package service;

import model.Dentist;

import java.util.List;
import java.util.Optional;

public interface DentistService {
    List<Dentist> getAllDentist();
    Dentist createUser(Dentist dentist);
    Optional<Dentist> getUserById(Long id);
    Dentist updateDentist(long id, Dentist dentistDetails);
    void deleteDentist(Long id);
}
