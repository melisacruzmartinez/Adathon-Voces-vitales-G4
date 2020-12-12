package ar.com.ada.api.vocesvitales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.vocesvitales.entities.Mentora;
import ar.com.ada.api.vocesvitales.services.MentoraService;
@RestController
public class MentoraController {
    @Autowired
    MentoraService mentoraService;
    @PostMapping("/guardarcategorias")
    public ResponseEntity<?>crearMentora(@RequestBody Mentora mentora){
        mentoraService.crearMentora(mentora);
        return ResponseEntity.ok(mentora.getId());
    }


// 
// @RequestMapping("mentora")
// public class MentoraController {
//     @Autowired
//     private MentoraService mentoraService;

    

//     @RequestMapping(value="}/lista", method = RequestMethod.GET)
//      public String listaUsuarios(Mentora mentora){
//          mentora.put("usuarios", mentoraService.findAll());
//          return "mentora/lista";
//     }
    
    // @PostMapping("/guardar")
    // public void guardar(@RequestBody Mentora mentora){
    //     mentoraController.save(mentora);
    // }
}
