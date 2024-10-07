package dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class claimDto {
    private long id;
    private ZonedDateTime claimDate;
    private String claimText;
    private ClaimStatus status;

}
