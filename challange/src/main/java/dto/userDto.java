package dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class userDto {

    private long id;

    private String name;

    private int CPF;

    private int birthdate;
}
