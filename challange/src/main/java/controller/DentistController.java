package controller;

import dto.DentistDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import service.DentistService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DentistController {

    private final DentistService dentistService;

    @GetMapping
    public ResponseEntity<List<DentistDto>> getAllProjects() {
        return ResponseEntity.ok(dentistService.getAllProjects());
    }

    @GetMapping("/paged")
    public Page<DentistDto> getAllProjectsPaged(Pageable pageable) {
        return dentistService.getAllProjectsPaged(pageable);
    }

    // Endpoint para buscar projeto por UUID
    @GetMapping("/{uuid}")
    public ResponseEntity<DentistDto> buscarPorUUID(@PathVariable UUID uuid) {
        Optional<DentistDto> projetoDTO = dentistService.buscarPorUUID(uuid);
        return dentistDto.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> createProject(@RequestBody DentistDto dentistDto) {
        try {
            DentistDto novoDentist = dentistService.saveProject(dentistDto);
            return new ResponseEntity<>(novoProjeto, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {

            return new ResponseEntity<>("Dentista já existe.", HttpStatus.CONFLICT);
        }

    }
}
