package ar.com.ada.api.vocesvitales.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.com.ada.api.vocesvitales.entities.Mentora;

public class MentoraRepo {
    public interface MentoraRepository extends JpaRepository<Mentora, Integer> {
        
    }
}
