package ar.com.ada.api.vocesvitales.entities;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "aspirantes")

public class Aspirante {
    @Id
    @Column (name = "aspirante_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aspiranteId;
    @NaturalId
    @Column (name = "aspirante_dni", nullable = false)
    private int dni;
    @Column (name = "aspirante_nombre", nullable = false, length = 100)
    private String nombre;
    @Column (name = "aspirante_apellido", nullable = false, length = 100)
    private String apellido;
    @Column (name = "aspirante_mail", nullable = false, length = 200)
    private String mail;
    @Column (name = "aspirante_telefono", nullable = false)
    private int telefono;
    @Column (name = "aspirante_info", nullable = false, length = 600)
    private String detalleInscripta;
    @Column (name = "aspirante_horarios" , nullable = false, length = 100)
    private String horario;
    @Column (name = "aspirante_direccion", nullable = false, length = 200)
    private int direccion;
    @Column (name = "aspirante_experiencia", nullable = false)
    private int experiencia;

    
    public void setAspiranteId(Integer aspiranteId) {
        this.aspiranteId = aspiranteId;
    }

    public Integer getAspiranteId() {
        return aspiranteId;
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

    public String getDetalleInscripta() {
        return detalleInscripta;
    }

    public void setDetalleInscripta(String detalleInscripta) {
        this.detalleInscripta = detalleInscripta;
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Aspirante [apellido=" + apellido + ", aspiranteId=" + aspiranteId + ", detalleInscripta="
                + detalleInscripta + ", direccion=" + direccion + ", dni=" + dni + ", experiencia=" + experiencia
                + ", horario=" + horario + ", mail=" + mail + ", nombre=" + nombre + ", telefono=" + telefono + "]";
    }

    

}
