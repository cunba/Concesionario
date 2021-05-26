package com.sanvalero.domain;

import java.util.Objects;

/**
 * Clase correspondiente a persona. Es la clase madre de Usuario y Administrador
 */
public class Persona {
    //Definimos los elementos de la clase
    private final int id;
    private final String nombre;
    private final String apellido;
    private final String dni;
    private final String telefono;
    private final String email;

    /**
     * Constructor de persona
     * @param id de la persona
     * @param nombre de la persona
     * @param apellido de la persona
     * @param dni de la persona
     * @param telefono de la persona
     * @param email de la persona
     */
    public Persona(int id, String nombre, String apellido, String dni, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Metodo para obtener el ID de una persona
     * @return el ID
     */
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Metodo que sobreescribe la funcion equals()
     * @param o Persona
     * @return TRUE si sus IDs coinciden o FALSE si sus IDs no coinciden
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getId() == persona.getId();
    }

    /**
     * Metodo que sobreescribe la funcion hashCode()
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    /**
     * Metodo que sobreescribe la funcion toString()
     * @return los elementos de la persona en el formato definido
     */
    @Override
    public String toString() {
        return "ID = '" + id + '\'' +
                ", nombre = '" + nombre + '\'' +
                ", apellido = '" + apellido + '\'' +
                ", dni = '" + dni + '\'' +
                ", telefono = '" + telefono + '\'' +
                ", email = '" + email + '\'';
    }
}