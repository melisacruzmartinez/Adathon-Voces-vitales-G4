package ar.com.ada.api.vocesvitales.entities;

import javax.persistence.*;


@Entity
@Table(name = "experiencia")

public class Experiencia {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "experiencia", nullable = false, length = 100)
    private String experiencia;
    @JoinColumn(name = "aspirante", referencedColumnName = "id")
    @ManyToOne
    private Aspirante aspirante;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public Aspirante getAspirante() {
        return aspirante;
    }

    public void setAspirante(Aspirante aspirante) {
        this.aspirante = aspirante;
    }
    
}
