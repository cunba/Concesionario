package com.sanvalero.domain;

/**
 * Clase que corresponde al comprador. Es una clase que hereda de Usuario
 */
public class Comprador extends Usuario {
    //Declaracion de elementos del comprador
    private float importeTotalCompras;
    private int vehiculosComprados;

    /**
     * Constructor de comprador
     * @param id del comprador
     * @param nombre del comprador
     * @param apellido del comprador
     * @param dni del comprador
     * @param telefono del comprador
     * @param email del comprador
     */
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

    /**
     * Metodo que sobreescribe a la funcion toString()
     * @return el comprador en el formato que hemos definido
     */
    @Override
    public String toString() {
        return "Comprador { " +
                super.toString() +
                ", importeTotalCompras = '" + importeTotalCompras + '\'' +
                ", vehiculosComprados = '" + vehiculosComprados + '\'' +
                '}';
    }

    /**
     * Metodo que suma 1 a vehiculosComprados y al importeTotalCompras le suma el precio del vehiculo que se compra
     * @param importe precio del vehiculo que se compra
     */
    public void comprarVehiculo(float importe) {
        vehiculosComprados++;
        importeTotalCompras = importeTotalCompras + importe;
    }
}