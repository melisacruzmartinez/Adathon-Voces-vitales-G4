package ar.com.ada.api.vocesvitales.entities;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "experiencia")

public class Experiencia {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "experiencia", nullable = false, length = 100)
    private String experiencia;
}