package ar.com.ada.api.vocesvitales.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.vocesvitales.entities.Experiencia;
import ar.com.ada.api.vocesvitales.repos.ExperienciaRepo;

@Service
public class ExperienciaService {
    @Autowired
    private ExperienciaRepo repo;

        public List<Experiencia> obtenerExperiencias(){
            return(repo.findAll());

        }
        public Experiencia obtenerExperiencia(int experienciaId){

        Optional<Experiencia> ex = repo.findById(experienciaId);
        if(ex.isPresent())
             return ex.get();
        return null;
    }
		public Experiencia obtenerPorId(int experienciaId) {
			return null;
		}

}