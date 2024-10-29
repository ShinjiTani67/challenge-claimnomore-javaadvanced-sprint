package mapper;

import dto.ClaimDto;
import dto.UserDto;
import model.Claim;
import model.User;

public interface ClaimMapper {
    ClaimDto toDto(Claim claim);
    Claim toEntity(Claim projectDTO);
}
