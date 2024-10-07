package repository;

import model.Claim;
import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClaimRepository extends JpaRepository {
    Optional<Claim> findByUuid(UUID uuid);
}
