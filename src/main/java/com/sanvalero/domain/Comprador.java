package com.sanvalero.domain;

public class Comprador extends Usuario {
    private float importeTotalCompras;
    private int vehiculosComprados;

    public Comprador(int id, String nombre, String apellido, String dni, String telefono, String email) {
        super(id, nombre, apellido, dni, telefono, email);
    }

    public float getImporteTotalCompras() {
        return importeTotalCompras;
    }

    public void setImporteTotalCompras(float importeTotalCompras) {
        this.importeTotalCompras = importeTotalCompras;
    }

    public int getVehiculosComprados() {
        return vehiculosComprados;
    }

    public void setVehiculosComprados(int vehiculosComprados) {
        this.vehiculosComprados = vehiculosComprados;
    }

    @Override
    public String toString() {
        return "Comprador {'" + '\'' +
                super.toString() +
                ", importeTotalCompras = '" + importeTotalCompras + '\'' +
                ", cochesComprados = '" + vehiculosComprados + '\'' +
                '}';
    }

    public void comprarVehiculo(float importe) {
        vehiculosComprados++;
        importeTotalCompras = importeTotalCompras + importe;
    }
}