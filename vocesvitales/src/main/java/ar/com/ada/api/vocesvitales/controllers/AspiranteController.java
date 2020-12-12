package ar.com.ada.api.vocesvitales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.vocesvitales.entities.Aspirante;
import ar.com.ada.api.vocesvitales.services.AspiranteService;

@RestController
public class AspiranteController {
    @Autowired
    AspiranteService aspiranteService;
    @PostMapping("/guardaraspirantes")
    public ResponseEntity<?>crearAspirante(@RequestBody Aspirante aspirante){
        aspiranteService.crearAspirante(aspirante);
        return ResponseEntity.ok(aspirante.getId());
    }
    
}
