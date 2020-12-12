package ar.com.ada.api.vocesvitales.services;

import ar.com.ada.api.vocesvitales.entities.Aspirante;
import ar.com.ada.api.vocesvitales.repos.AspiranteRepo;

public class AspiranteService {
    private AspiranteRepo repo;

    public void crearAspirante(Aspirante aspirante){
        repo.save(aspirante);
    }

}
