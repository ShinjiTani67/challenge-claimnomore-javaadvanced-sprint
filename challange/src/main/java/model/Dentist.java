package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.Name;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="tb_dentist")
public class Dentist {
    
    @Id
    @GeneratedValue()
    private long id;   
    
    @Name("")
    @GeneratedValue()
    private String name;
    
}