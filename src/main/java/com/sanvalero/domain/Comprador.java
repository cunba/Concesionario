package com.sanvalero.domain;

public class Comprador extends Usuario {
    private float importeTotalCompras;
    private int cochesComprados;

    public Comprador(String id, String nombre, String apellido, String dni) {
        super(id, nombre, apellido, dni);
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

    public void comprarCoche() {

    }
}