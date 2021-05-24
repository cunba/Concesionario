package com.sanvalero.domain;

public class Vendedor extends Usuario {
    private final float sueldo;
    private int cochesVendidos;

    public Vendedor(int id, String nombre, String apellido, String dni, String telefono, String email, float sueldo) {
        super(id, nombre, apellido, dni, telefono, email);
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

    public void calcularSalarioMensual() {

    }

    public void venderCoche() {

    }

    public void registrarComprador() {

    }
}