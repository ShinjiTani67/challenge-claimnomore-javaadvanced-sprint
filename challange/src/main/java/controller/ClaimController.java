package controller;

import dto.ClaimDto;
import lombok.AllArgsConstructor;
import model.Claim;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.ClaimRepository;
import service.ClaimService;

import java.util.List;
import java.util.UUID;

//teste de um projeto em multiplos repositorios
@RestController
@RequestMapping("/claim")
@AllArgsConstructor
public class ClaimController {

    @Autowired
    private final ClaimService claimService;

    @PutMapping("/{uuid}")
    public ResponseEntity<?> atualizarClaim(@RequestBody ClaimDto claimDto,
                                             @PathVariable UUID uuid) {
        try {
            claimDto.setUuid(uuid);
            return new ResponseEntity<>(claimService.atualizarClaim(claimDto), HttpStatus.OK);
        } catch (IllegalArgumentException e) {

            return new ResponseEntity<>("Tarefa com UUID não existe.", HttpStatus.NOT_FOUND);
        }
    }
}
