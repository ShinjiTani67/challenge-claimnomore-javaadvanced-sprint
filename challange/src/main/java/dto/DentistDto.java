package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DentistDto {
    private long id;

    private String name;

    private int CPF;

    private int birthdate;
}
