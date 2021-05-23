package com.sanvalero.domain;

public class Vendedor extends Usuario {
    private float sueldo;
    private int cochesVendidos;

    public Vendedor(String id, String nombre, String apellido, String dni) {
        super(id, nombre, apellido, dni);
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getCochesVendidos() {
        return cochesVendidos;
    }

    public void setCochesVendidos(int cochesVendidos) {
        this.cochesVendidos = cochesVendidos;
    }

    @Override
    public String toString() {
        return "sueldo = '" + sueldo + '\'' +
                ", cochesVendidos = '" + cochesVendidos + '\'' +
                '}';
    }
}