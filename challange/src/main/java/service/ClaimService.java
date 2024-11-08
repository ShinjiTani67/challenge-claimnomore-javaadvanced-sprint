package service;

import dto.ClaimDto;
import lombok.AllArgsConstructor;
import mapper.ClaimMapper;
import model.Claim;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.ClaimRepository;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ClaimService   {
    private final ClaimRepository claimRepository;
    private final ClaimMapper claimMapper;

    public Optional<ClaimDto>buscarUUID(UUID uuid) {
        return claimRepository.findByUuid(uuid).map(claimMapper::toDto);
    }

    @Transactional
    public ClaimDto atualizarClaim(ClaimDto  claimDto) {

        Optional<Claim> claimExistente = claimRepository.findByUuid(claimDto.getUuid());

        if (claimExistente.isEmpty()) {
            throw new IllegalArgumentException("Sinistro com UUID não existente.");
        }
        Claim claim = claimMapper.toEntity(claimDto);
        Claim savedClaim = (Claim) claimRepository.save(claim);
        return claimMapper.toDto(savedClaim);
    }
}
