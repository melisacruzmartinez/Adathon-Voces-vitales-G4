package ar.com.ada.api.vocesvitales.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "aspirante")

public class Aspirante {
    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NaturalId
    @Column (name = "dni", nullable = true)
    private int dni;
    @Column (name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column (name = "apellido", nullable = false, length = 100)
    private String apellido;
    @Column (name = "mail", nullable = false, length = 100)
    private String mail;
    @Column (name = "telefono", nullable = true)
    private int telefono;
    @Column (name = "detalle", nullable = true, length = 512)
    private String detalle;
    @Column (name = "horarios" , nullable = true, length = 100)
    private String horario;
    @Column (name = "direccion", nullable = true, length = 200)
    private int direccion;
    //nueva opcion de habilidades se reemplaza por experiencia
    @OneToMany(mappedBy = "aspirante", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore   
     private List<Experiencia> experiencia = new ArrayList<>();

    @Column (name = "estado", nullable = true)
    private int estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }


    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Experiencia> getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(List<Experiencia> experiencia) {
        this.experiencia = experiencia;
    }

    
}