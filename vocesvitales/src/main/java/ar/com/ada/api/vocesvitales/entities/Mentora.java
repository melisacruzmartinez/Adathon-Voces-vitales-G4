package ar.com.ada.api.vocesvitales.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "mentoras")

public class Mentora {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aspirante_fk", referencedColumnName = "id")
    private Aspirante aspirante;
    @JsonFormat(pattern = "yyyy-mm-dd", shape = Shape.STRING)
    @Column(name = "fecha_alta", nullable = false)
    private String fechaAlta;
    @JsonFormat(pattern = "yyyy-mm-dd", shape = Shape.STRING)
    @Column(name = "tipo_mentoria", nullable = true, length = 512)
    private String tipoMentoria;
    @Column(name = "cant_mentorias", nullable = true)
    private int cantMentorias;
    @Column(name = "logros", nullable = false, length = 512)
    private String logros;
    @Column(name = "fecha_baja", nullable = true)
    private String fechaBaja;
    @Column(name = "razon_baja", nullable = true, length = 512)
    private String razonBaja;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getTipoMentoria() {
        return tipoMentoria;
    }

    public void setTipoMentoria(String tipoMentoria) {
        this.tipoMentoria = tipoMentoria;
    }

    public int getCantMentorias() {
        return cantMentorias;
    }

    public void setCantMentorias(int cantMentorias) {
        this.cantMentorias = cantMentorias;
    }

    public String getRazonBaja() {
        return razonBaja;
    }

    public void setRazonBaja(String razonBaja) {
        this.razonBaja = razonBaja;
    }

    public String getLogros() {
        return logros;
    }

    public void setLogros(String logros) {
        this.logros = logros;
    }

   
}