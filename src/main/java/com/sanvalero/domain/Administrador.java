package com.sanvalero.domain;

public class Administrador extends Persona {
    public Administrador(String id, String nombre, String apellido, String dni) {
        super(id, nombre, apellido, dni);
    }

    public void registrarVendedor() {

    }

    public void registrarComprador() {

    }

    public void registrarCoche() {

    }

    public void registrarMoto() {

    }

    @Override
    public String toString() {
        return "Administrador {" +
                super.toString() +
                "}";
    }
}
