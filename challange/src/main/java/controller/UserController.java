package controller;

import dto.DentistDto;
import dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import service.DentistService;
import service.UserService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<userDto>> getAllProjects() {
        return ResponseEntity.ok(userService.getAllProjects());
    }

    @GetMapping("/paged")
    public Page<UserDto> getAllProjectsPaged(Pageable pageable) {
        return userService.getAllProjectsPaged(pageable);
    }


    @GetMapping("/{uuid}")
    public ResponseEntity<UserDto> buscarPorUUID(@PathVariable UUID uuid) {
        Optional<UserDto> userDto = userService.buscarPorUUID(uuid);
        return userDto.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> createProject(@RequestBody UserDto) {
        try {
            UserDto novoDentist = userService.saveProject(userDto);
            return new ResponseEntity<>(novoProjeto, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {

            return new ResponseEntity<>("Usuário já existe.", HttpStatus.CONFLICT);
        }

    }
}
