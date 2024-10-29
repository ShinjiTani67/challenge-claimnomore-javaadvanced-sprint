package model;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Data;
import lombok.Generated;
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

    @Name(name = "name_user")
    @Column(name = "description", length = 100, nullable = false)
    private String name;

    @Column(name = "cpf", length = 100, nullable = false)
    private int CPF;

    @DateTimeFormat
    private int birthdate;



}
