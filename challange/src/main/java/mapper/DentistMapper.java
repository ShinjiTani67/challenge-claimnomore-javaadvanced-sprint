package mapper;

import dto.DentistDto;
import dto.UserDto;
import model.Dentist;
import model.User;

public interface DentistMapper {
    static DentistDto toDto(Dentist project);
    Dentist toEntity(Dentist DentistDto);
}
