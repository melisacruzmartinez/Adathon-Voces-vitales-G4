package ar.com.ada.api.vocesvitales.services;

import org.springframework.stereotype.Service;

import antlr.collections.List;
import ar.com.ada.api.vocesvitales.entities.Mentora;
import ar.com.ada.api.vocesvitales.repos.MentoraRepo;

@Service
public class MentoraService {
    private MentoraRepo repo;

    public void crearMentora(Mentora mentora){
        repo.save(mentora);
    }

}
