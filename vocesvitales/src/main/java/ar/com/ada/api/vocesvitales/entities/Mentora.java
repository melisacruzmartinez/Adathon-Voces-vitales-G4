package ar.com.ada.api.vocesvitales.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "mentoras")

public class Mentora {
    
    @Id
    @Column (name = "mentora_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mentoraId;
    @JsonFormat(pattern = "yyyy-mm-dd", shape = Shape.STRING)
    @Column (name = "mentora_alta", nullable = false)
    private String fechaAlta;
    @JsonFormat(pattern = "yyyy-mm-dd", shape = Shape.STRING)
    @Column (name = "mentora_baja", nullable = true)
    private String fechaBaja;
    @Column (name = "mentora_tipo",nullable = true, length = 500)
    private String tipoMentoria;
    @Column (name = "mentora_contador", nullable = true)
    private int cantMentorias;
    @Column (name = "mentora_razon_baja",nullable = true, length = 500)
    private String razonBaja;
    @Column (name = "mentora_horario",nullable = false, length = 200)
    private String horario;
    @Column (name = "mentora_logros",nullable = false, length = 500)
    private String mentoriaLogros;
    @Column (name = "mentora_certificado",nullable = true)
    private boolean certificado;

    
   
    public Integer getMentoraId() {
        return mentoraId;
    }

    public void setMentoraId(Integer mentoraId) {
        this.mentoraId = mentoraId;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMentoriaLogros() {
        return mentoriaLogros;
    }

    public void setMentoriaLogros(String mentoriaLogros) {
        this.mentoriaLogros = mentoriaLogros;
    }

    public boolean isCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    @Override
    public String toString() {
        return "Mentora [cantMentorias=" + cantMentorias + ", certificado=" + certificado + ", fechaAlta=" + fechaAlta
                + ", fechaBaja=" + fechaBaja + ", horario=" + horario + ", mentoraId=" + mentoraId + ", mentoriaLogros="
                + mentoriaLogros + ", razonBaja=" + razonBaja + ", tipoMentoria=" + tipoMentoria + "]";
    }

}
