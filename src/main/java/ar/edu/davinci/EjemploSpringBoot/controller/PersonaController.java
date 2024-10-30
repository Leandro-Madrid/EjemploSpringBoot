package ar.edu.davinci.EjemploSpringBoot.controller;


import ar.edu.davinci.EjemploSpringBoot.model.Persona;
import ar.edu.davinci.EjemploSpringBoot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;


    @GetMapping("/hola")
    public String hola() {
        return "Hola che";
    }

    @GetMapping("/repetir/{unAlgo}")
    public void repetir(@PathVariable("unAlgo") String unAlgo) {
        System.out.println(unAlgo);
    }


   @PostMapping("/nueva")
   public Persona agregarPersona(@RequestBody Persona unaPersona) {
       System.out.println("Persona agregada con exito");
       return this.personaService.agregarSiSePuede(unaPersona);
   }

   @GetMapping("/{unID}")
   public Persona buscarPorId(@PathVariable Long unID){
        return this.personaService.buscarPorId(unID);
   }

   @GetMapping("/dni")
   public Persona buscarPersonaPOrDNI(@RequestParam String unDNI){
        return this.personaService.buscarPorDNI(unDNI);
   }


    @GetMapping("/")
    public List<Persona> getPersonas() {
        return this.personaService.getPersonas();
    }

    @GetMapping("/busqueda")
    public List<Persona> buscarPersonasEntreEdades(@RequestParam Integer unaEdad, @RequestParam Integer otraEdad){
        return this.personaService.buscarPersonasEntreEdades(unaEdad, otraEdad);
    }

}
