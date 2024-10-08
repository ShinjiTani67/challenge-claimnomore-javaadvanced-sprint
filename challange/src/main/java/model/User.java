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
    @GeneratedValue()
    private long id;

    @Name()
    @GeneratedValue()
    private String name;

    private int CPF;

    @DateTimeFormat
    @GeneratedValue()
    private int birthdate;



}
