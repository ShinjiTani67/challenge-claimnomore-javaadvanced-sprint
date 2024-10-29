package model;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="tb_dentist")
public class Dentist {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;   
    
    @Name("")
    private String name;


}