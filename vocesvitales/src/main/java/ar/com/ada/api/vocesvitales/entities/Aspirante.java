package ar.com.ada.api.vocesvitales.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "aspirante")

public class Aspirante {
    @Column (name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
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
    private String direccion;
    //nueva opcion de habilidades se reemplaza por experiencia
    @OneToMany(mappedBy = "aspirante", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
     private int experienciaId;

    @Column (name = "estado", nullable = true, length = 48)
    private String estado;

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

    

    public int getExperienciaId() {
        return experienciaId;
    }

    public void setExperienciaId(int experienciaId) {
        this.experienciaId = experienciaId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

   

    
}