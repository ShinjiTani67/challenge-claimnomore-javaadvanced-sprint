package mapper;

import dto.ClaimDto;
import model.Claim;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface ClaimMapper {
    ClaimDto toDto(Claim claim);
    Claim toEntity(Claim projectDTO);
}
