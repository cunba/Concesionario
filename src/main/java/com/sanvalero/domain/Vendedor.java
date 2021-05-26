package com.sanvalero.domain;

public class Vendedor extends Usuario {
    private final float sueldo;
    private int vehiculosVendidos;

    public Vendedor(int id, String nombre, String apellido, String dni, String telefono, String email, float sueldo) {
        super(id, nombre, apellido, dni, telefono, email);
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public int getVehiculosVendidos() {
        return vehiculosVendidos;
    }

    public void setVehiculosVendidos(int vehiculosVendidos) {
        this.vehiculosVendidos = vehiculosVendidos;
    }

    @Override
    public String toString() {
        return "Vendedor {" +
                super.toString() +
                ", sueldo = '" + sueldo + '\'' +
                ", vehiculosVendidos = '" + vehiculosVendidos + '\'' +
                "}";
    }

    public float calcularSalarioMensual() {
        return (float) (sueldo + sueldo * 0.2 * vehiculosVendidos);
    }

    public void venderVehiculo() {
        vehiculosVendidos++;
    }
}