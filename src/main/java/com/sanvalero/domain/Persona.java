package com.sanvalero.domain;

import java.util.Objects;

public class Persona {
    private final int id;
    private final String nombre;
    private final String apellido;
    private final String dni;
    private final String telefono;
    private final String email;

    public Persona(int id, String nombre, String apellido, String dni, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getId() == persona.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

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