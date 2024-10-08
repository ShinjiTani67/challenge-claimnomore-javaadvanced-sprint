package mapper;

import dto.UserDto;
import model.User;

public interface UserMapper {
    static UserDto toDto(User project);
    User toEntity(User UserDto);
}
