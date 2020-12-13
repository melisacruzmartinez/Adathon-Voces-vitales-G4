package ar.com.ada.api.vocesvitales.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.vocesvitales.entities.Aspirante;
import ar.com.ada.api.vocesvitales.repos.AspiranteRepo;

@Service
public class AspiranteService {
    @Autowired
    private AspiranteRepo repo;
    public void crearAspirante(Aspirante aspirante){
        repo.save(aspirante);
    }

    public List<Aspirante> obtenerAspirantes(){       
        return (repo.findAll());//traer todo
    }
    public Aspirante obtenerPorId(int id){
        return repo.findById(id);

    }
    public void grabar(Aspirante aspirante){
        repo.save(aspirante);
    }
}
