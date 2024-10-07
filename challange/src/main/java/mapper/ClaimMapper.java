package mapper;

import dto.ClaimDto;
import dto.UserDto;
import model.Claim;
import model.User;

public interface ClaimMapper {
    static ClaimDto toDto(Claim project);
    Claim toEntity(Claim projectDTO);
}
