package service;

import model.Claim;

import java.util.List;
import java.util.Optional;

public interface ClaimService   {
    List<Claim> getAllClaim();
    Claim createClaim(Claim claim);
    Optional<Claim> getUserById(Long id);
    Claim updateClaim(long id, Claim claimDetails);
    void deleteClaim(Long id);
}
