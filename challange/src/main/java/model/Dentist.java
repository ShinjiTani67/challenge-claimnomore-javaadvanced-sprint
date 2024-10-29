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

    @Column(name = "name_dentist", length = 100, nullable = false)
    private String name;

    @Column(name = "cpf_dentist", length = 100, nullable = false)
    private int CPF;

    @Column(name = "cro_dentist", length = 100, nullable = false)
    private String CRO;

    @Column(name = "adress_dentist", length = 100, nullable = false)
    private String adress;

    @Column(name = "phone_dentist", length = 100, nullable = false)
    private int phone;
}