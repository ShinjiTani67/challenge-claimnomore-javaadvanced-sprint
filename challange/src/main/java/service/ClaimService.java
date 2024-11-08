package service;

import dto.ClaimDto;
import lombok.AllArgsConstructor;
import mapper.ClaimMapper;
import model.Claim;
import org.springframework.stereotype.Service;
import repository.ClaimRepository;

import java.util.List;
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

}
