package mapper;

import dto.UserDto;
import model.User;

public interface UserMapper {

    UserDto toDto(User user);
    User toEntity(User UserDto);
}
