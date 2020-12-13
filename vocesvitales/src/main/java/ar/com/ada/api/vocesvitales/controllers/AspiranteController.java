package ar.com.ada.api.vocesvitales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.vocesvitales.entities.Aspirante;
import ar.com.ada.api.vocesvitales.entities.Experiencia;
import ar.com.ada.api.vocesvitales.models.request.AspiranteAllInfo;
import ar.com.ada.api.vocesvitales.models.request.AspiranteInfoBasic;
import ar.com.ada.api.vocesvitales.models.response.RespuestaFront;
import ar.com.ada.api.vocesvitales.services.AspiranteService;
import ar.com.ada.api.vocesvitales.services.ExperienciaService;

@RestController
public class AspiranteController {
    @Autowired
    AspiranteService aspiranteService;
    @Autowired
    ExperienciaService experienciaService;
    @PostMapping("/aspirantes")
    public ResponseEntity<?> crearAspirante(@RequestBody AspiranteInfoBasic info){
        Aspirante aspirante = new Aspirante();
        aspirante.setNombre(info.nombre);
        aspirante.setApellido(info.apellido);
        aspirante.setMail(info.mail);

        // Experiencia experiencia = experienciaService.obtenerPorId(info.experienciaId);
        // aspirante.setExperienciaId(experiencia);
        
        
        aspiranteService.crearAspirante(aspirante);
        RespuestaFront respuestaFront = new RespuestaFront();
        respuestaFront.isOk = true;
        respuestaFront.id = aspirante.getId();
        respuestaFront.message = "Aspirante guardado !";
        return ResponseEntity.ok(respuestaFront);
    }

    @GetMapping("/aspirantes")
    public ResponseEntity<List<Aspirante>> listarAspirante(){
        return ResponseEntity.ok(aspiranteService.obtenerAspirantes());
    }

    @GetMapping("aspirantes/{id}")
    public ResponseEntity<Aspirante> obtenerAspirante(@PathVariable int id){
        Aspirante aspirante = aspiranteService.obtenerPorId(id);
        if(aspirante == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(aspirante);
    }

    @PutMapping("/aspirantes/{id}")
    public ResponseEntity<RespuestaFront> actualizarAspirante(@PathVariable int id,  @RequestBody AspiranteAllInfo info){
        Aspirante aspirante = aspiranteService.obtenerPorId(id);
        if(aspirante== null){
            return ResponseEntity.notFound().build();
        }
        aspirante.setDni(info.dni);
        aspirante.setNombre(info.nombre);
        aspirante.setApellido(info.apellido);
        aspirante.setMail(info.mail);
        aspirante.setTelefono(info.telefono);
        aspirante.setDetalle(info.detalle);
        aspirante.setHorario(info.horario);
        aspirante.setDireccion(info.direccion);
        aspirante.setEstado(info.estado);

        aspiranteService.grabar(aspirante);
        RespuestaFront gR = new RespuestaFront();
        gR.isOk = true;
        gR.id = aspirante.getId();
        gR.message = "Aspirante actualizado con exito !!";
        return ResponseEntity.ok(gR);
    }
    @DeleteMapping("/aspirantes/{id}")
    public ResponseEntity<RespuestaFront> borrarAspirante(@PathVariable int id){
        Aspirante aspirante = aspiranteService.obtenerPorId(id);
        if(aspirante == null){
            return ResponseEntity.notFound().build();
    }
    
    aspirante.setEstado("no seleccionada");
    aspiranteService.grabar(aspirante);
    RespuestaFront gR = new RespuestaFront();
    gR.isOk = true;
    gR.message = " Aspirante borrada ";
    return ResponseEntity.ok(gR);
}
    
}
