package ar.com.ada.api.vocesvitales.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.vocesvitales.entities.Experiencia;

public interface ExperienciaRepo extends JpaRepository<Experiencia, Integer> {
    
}
