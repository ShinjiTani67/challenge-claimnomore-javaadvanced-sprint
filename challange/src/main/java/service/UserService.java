package service;

import dto.ClaimDto;
import dto.UserDto;
import mapper.UserMapper;
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

    private  UserRepository userRepository;
    private  UserMapper userMapper;

    @Transactional
    public List<UserDto> getAllUser() {
        return UserRepository.findAll()
                .stream()
                .map(UserRepository::toDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public Page<UserDto> getAllUserPaged(Pageable pageable) {
        return UserRepository.findAll(pageable)
                .map(ClaimRepository::toDto);
    }

    @Transactional
    public UserDto saveUser(UserDto userDto) {

        Optional<User> userExistente = UserRepository.findByUuid(UserDto.getUuid());
        if (userExistente.isPresent()) {
            throw new IllegalArgumentException("Projeto com UUID já existente.");
        }
        User project = UserMapper.toEntity(userDto);
        User savedProject = userRepository.save(User);
        return UserMapper.toDto(savedProject);
    }

    @Transactional(readOnly = true)
    public Optional<ClaimDto> buscarPorUUID(UUID uuid) {
        return userRepository.findByUuid(uuid).map(UserMapper::toDto);
    }


}
