package dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DentistDto {

    private UUID uuid;

    private String name;

    private int CPF;

    private String CRO;

    private String adress;

    private int phone;

    private String email;

    private int birthdate;
}
