package com.sanvalero.domain;

/**
 * Clase correspondiente al coche. Es una clase que hereda de vehiculo
 */
public class Coche extends Vehiculo {
    //Declaracion de elementos del coche
    private final int nPuertas;
    private final int nAsientos;

    /**
     * Constructor de coche
     * @param matricula del coche
     * @param marca del coche
     * @param modelo del coche
     * @param tipo del coche
     * @param tipoCombustible del coche
     * @param caballos del coche
     * @param precio del coche
     * @param nPuertas del coche
     * @param nAsientos del coche
     */
    public Coche(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos, float precio, int nPuertas, int nAsientos) {
        super(matricula, marca, modelo, tipo, tipoCombustible, caballos, precio);
        this.nPuertas = nPuertas;
        this.nAsientos = nAsientos;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public int getnAsientos() {
        return nAsientos;
    }

    /**
     * Metodo que sobreescribe la funcion toString()
     * @return el coche en el formato que hemos definido
     */
    @Override
    public String toString() {
        return "Coche { " +
                super.toString() +
                ", nPuertas = '" + nPuertas + '\'' +
                ", nAsientos = '" + nAsientos + '\'' +
                " }";
    }
}