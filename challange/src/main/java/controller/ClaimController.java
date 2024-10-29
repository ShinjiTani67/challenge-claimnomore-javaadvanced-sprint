package controller;

import dto.ClaimDto;
import dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ClaimController {
    private final ClaimService ClaimService;

    @GetMapping
    public ResponseEntity<List<claimDto>> getAllProjects() {
        return ResponseEntity.ok(claimService.getAllProjects());
    }

    @GetMapping("/paged")
    public Page<ClaimDto> getAllProjectsPaged(Pageable pageable) {
        return claimService.getAllProjectsPaged(pageable);
    }


    @GetMapping("/{uuid}")
    public ResponseEntity<UserDto> buscarPorUUID(@PathVariable UUID uuid) {
        Optional<ClaimDto> ClaimDto = ClaimService.buscarPorUUID(uuid);
        return claimDto.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> createProject(@RequestBody claimDto) {
        try {
            UserDto novoDentist = claimService.saveProject(claimDto);
            return new ResponseEntity<>(novoProjeto, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {

            return new ResponseEntity<>("Sinistro já existe.", HttpStatus.CONFLICT);
        }

    }
}
