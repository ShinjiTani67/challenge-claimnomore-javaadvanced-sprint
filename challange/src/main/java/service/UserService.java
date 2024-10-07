package service;

import dto.ClaimDto;
import dto.UserDto;
import mapper.UserMapper;
import model.Claim;
import model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import repository.ClaimRepository;
import repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class UserService {

    private final UserRepository projetoRepository;
    private final UserMapper projetoMapper;

    @Transactional
    public List<UserDto> getAllProjects() {
        return UserRepository.findAll()
                .stream()
                .map(UserRepository::toDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public Page<UserDto> getAllProjectsPaged(Pageable pageable) {
        return UserRepository.findAll(pageable)
                .map(ClaimRepository::toDto);
    }

    @Transactional
    public UserDto saveProject(UserDto userDto) {

        Optional<User> projetoExistente = UserRepository.findByUuid(UserDto.getUuid());
        if (projetoExistente.isPresent()) {
            throw new IllegalArgumentException("Projeto com UUID já existente.");
        }
        Projeto project = UserMapper.toEntity(projetoDTO);
        Projeto savedProject = userRepository.save(project);
        return UserMapper.toDto(savedProject);
    }

    @Transactional(readOnly = true)
    public Optional<ClaimDto> buscarPorUUID(UUID uuid) {
        return userRepository.findByUuid(uuid).map(UserMapper::toDto);
    }


}
