package ar.com.ada.api.vocesvitales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.vocesvitales.entities.Mentora;
import ar.com.ada.api.vocesvitales.services.MentoraService;

@RestController
@RequestMapping("mentora")
public class MentoraController {
    @Autowired
    MentoraService mentoraService;

    private MentoraController mentoraController;

    // @RequestMapping(value="", method = RequestMethod.GET)
    // public String listaUsuarios(ModelMap mp){
    //     mp.put("usuarios", uc.findAll());
    //     return "crud/lista";
    // }
    // @PostMapping("/guardar")
    // public void guardar(@RequestBody Mentora mentora){
    //     mentoraController.save(mentora);
    // }
}
