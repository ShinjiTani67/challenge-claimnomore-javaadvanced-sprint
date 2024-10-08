package model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.ZonedDateTime;
@Data
@ToString
@Entity
@Table(name = "tb_claim")
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //completar - criar automaticamente o valor
    private ZonedDateTime claimDate;

    @Column(name = "claim_text", length = 100, nullable = false)
    private String claimText;

    @ManyToOne
    @JoinColumn(name = "insurance_contract_claim_id", nullable = false)
    private InsuranceContract insuranceContract;

}
