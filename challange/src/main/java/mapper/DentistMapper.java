package mapper;

import dto.DentistDto;
import dto.UserDto;
import model.Dentist;
import model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DentistMapper {
    DentistDto toDto(Dentist dentist);
    Dentist toEntity(Dentist DentistDto);
}
