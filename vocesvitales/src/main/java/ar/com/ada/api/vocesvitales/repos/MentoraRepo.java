package ar.com.ada.api.vocesvitales.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ar.com.ada.api.vocesvitales.entities.Mentora;

@Repository
    public interface MentoraRepo extends JpaRepository<Mentora, Integer> {
        
    
}
