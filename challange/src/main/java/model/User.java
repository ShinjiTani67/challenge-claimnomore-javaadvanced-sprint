package model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@ToString
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue()
    private long id;


    private int CPF;

    @DateTimeFormat
    @GeneratedValue()
    private int birthdate;



}
