package com.sanvalero.domain;

/**
 * Clase correspondiente a moto. Es una clase que hereda de vehiculo
 */
public class Moto extends Vehiculo {
    /**
     * Constructor de moto
     * @param matricula de la moto
     * @param marca de la moto
     * @param modelo de la moto
     * @param tipo de la moto
     * @param tipoCombustible de la moto
     * @param caballos de la moto
     * @param precio de la moto
     */
    public Moto(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos, float precio, boolean disponible) {
        super(matricula, marca, modelo, tipo, tipoCombustible, caballos, precio, disponible);
    }

    /**
     * Metodo que sobreescribe la funcion toString
     * @return la moto en el formato que hemos definido
     */
    @Override
    public String toString() {
        return "Moto { " +
                super.toString() +
                " }";
    }
}