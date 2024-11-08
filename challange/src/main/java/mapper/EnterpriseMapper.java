package mapper;


import dto.EnterpriseDto;
import model.Enterprise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnterpriseMapper {
    EnterpriseDto toDto(Enterprise enterprise);
    Enterprise toEntity(Enterprise EnterpriseDto);
}
