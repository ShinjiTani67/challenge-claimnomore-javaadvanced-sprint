package service;

import dto.DentistDto;
import lombok.AllArgsConstructor;
import mapper.DentistMapper;
import model.Dentist;
import org.springframework.stereotype.Service;
import repository.DentistRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
@AllArgsConstructor
public class DentistService {
    private final DentistRepository dentistRepository;
    private final DentistMapper dentistMapper;

    Optional<DentistDto>buscarUUID(UUID uuid) {
        return dentistRepository.findByUuid(uuid).map(dentistMapper::toDto);
    }
}
