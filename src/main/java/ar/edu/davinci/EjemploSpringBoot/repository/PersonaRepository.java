package ar.edu.davinci.EjemploSpringBoot.repository;

import ar.edu.davinci.EjemploSpringBoot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    Persona getByDni(int unDNI);

    List<Persona> findByEdadBetween(Integer unaEdad, Integer otraEdad);

    @Query("SELECT p FROM Persona p WHERE p.edad BETWEEN :minEdad AND :maxEdad")
    List<Persona> buscarPersonasEntreEdades(@Param("minEdad") Integer unaEdad, @Param("maxEdad") Integer otraEdad);
}
