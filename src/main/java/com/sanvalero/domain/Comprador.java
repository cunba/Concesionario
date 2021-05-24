package com.sanvalero.domain;

public class Comprador extends Usuario {
    private float importeTotalCompras;
    private int cochesComprados;

    public Comprador(int id, String nombre, String apellido, String dni, String telefono, String email) {
        super(id, nombre, apellido, dni, telefono, email);
    }

    public float getImporteTotalCompras() {
        return importeTotalCompras;
    }

    public void setImporteTotalCompras(float importeTotalCompras) {
        this.importeTotalCompras = importeTotalCompras;
    }

    public int getCochesComprados() {
        return cochesComprados;
    }

    public void setCochesComprados(int cochesComprados) {
        this.cochesComprados = cochesComprados;
    }

    @Override
    public String toString() {
        return "Comprador {'" + '\'' +
                super.toString() +
                ", importeTotalCompras = '" + importeTotalCompras + '\'' +
                ", cochesComprados = '" + cochesComprados + '\'' +
                '}';
    }

    public void comprarCoche() {

    }
}