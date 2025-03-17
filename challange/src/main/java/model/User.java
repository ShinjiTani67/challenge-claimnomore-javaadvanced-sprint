package model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@ToString
@Entity
@Table(name="tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "email_user", length = 100, nullable = false)
    private String email;

    @Column(name = "name_user", length = 100, nullable = false)
    private String name;

    @Column(name = "cpf", length = 100, nullable = false)
    private int CPF;

    @DateTimeFormat
    @Column(name = "admission_date", length = 100, nullable = false)
    private int admissiondate;

    @Column(name = "job", length = 100, nullable = false)
    private String job;

}
