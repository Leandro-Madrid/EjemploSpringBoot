package ar.edu.davinci.EjemploSpringBoot.model;

import jakarta.persistence.*;

@Entity
public class Persona {
    private String nombre, apellido;
    private int edad, dni;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Persona() { //Obligatorio en Spring Boot

    }

    public Persona(String unNombre, String unApellido, int unaEdad, int unDni, Long unID) {
        this.nombre = unNombre;
        this.apellido = unApellido;
        this.edad = unaEdad;
        this.dni = unDni;
        this.id = unID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
