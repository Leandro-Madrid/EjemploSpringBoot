package ar.edu.davinci.EjemploSpringBoot.service;

import ar.edu.davinci.EjemploSpringBoot.model.Persona;
import ar.edu.davinci.EjemploSpringBoot.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    public Persona agregarSiSePuede(Persona unaPersona) {
        this.personaRepository.save(unaPersona);
        return unaPersona;
    }

    public List<Persona> getPersonas() {
        return this.personaRepository.findAll();
    }

    public Persona buscarPorId(Long unID) {
        return this.personaRepository.getReferenceById(unID);
    }

    public Persona buscarPorDNI(String unDNI) {
        int dniInt = Integer.parseInt(unDNI);
        System.out.println(dniInt);
        return this.personaRepository.getByDni(dniInt);
    }

    public List<Persona> buscarPersonasEntreEdades(Integer unaEdad, Integer otraEdad) {
        //List<Persona> personas = this.getPersonas();
        //return personas.stream().filter( persona -> persona.getEdad() >= unaEdad &&  persona.getEdad() <= otraEdad).toList();
        //return ????;
        //return this.personaRepository.findByEdadBetween(unaEdad, otraEdad);
        return this.personaRepository.buscarPersonasEntreEdades(unaEdad, otraEdad);
    }
}
