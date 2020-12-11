package ar.com.ada.api.vocesvitales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.vocesvitales.entities.Mentora;

@RestController
@RequestMapping("mentora")
public class MentoraController {
    @Autowired
    private MentoraController mentoraController;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Mentora mentora){
        mentoraController.save(mentora);
    }
}
