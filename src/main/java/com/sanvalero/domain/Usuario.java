package com.sanvalero.domain;

import java.util.ArrayList;

public class Usuario extends Persona {
    public Usuario(int id, String nombre, String apellido, String dni, String telefono, String email) {
        super(id, nombre, apellido, dni, telefono, email);
    }

    private void consultarCoches() {

    }

    private void consultarMotos() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
