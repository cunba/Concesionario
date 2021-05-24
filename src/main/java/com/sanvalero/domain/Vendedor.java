package com.sanvalero.domain;

public class Vendedor extends Usuario {
    private final float sueldo;
    private int cochesVendidos;

    public Vendedor(String id, String nombre, String apellido, String dni, float sueldo) {
        super(id, nombre, apellido, dni);
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public int getCochesVendidos() {
        return cochesVendidos;
    }

    public void setCochesVendidos(int cochesVendidos) {
        this.cochesVendidos = cochesVendidos;
    }

    @Override
    public String toString() {
        return "Vendedor {'" + '\'' +
                super.toString() +
                ", sueldo = '" + sueldo + '\'' +
                ", cochesVendidos = '" + cochesVendidos + '\'' +
                '}';
    }

    public void calcularSueldoTotal() {

    }

    public void venderCoche() {

    }

    public void registrarComprador() {

    }
}