package com.sanvalero.domain;

import java.util.Objects;

/**
 * Metodo correspondiente a vehiculo. Es la clase madre de coche y moto
 */
public class Vehiculo {
    //Declaracion de elementos de un vehiculo
    private final String matricula;
    private final String marca;
    private final String modelo;
    private final String tipo;
    private final String tipoCombustible;
    private final int caballos;
    private final float precio;
    private boolean disponible;

    /**
     * Constructor de vehiculo
     * @param matricula del vehiculo
     * @param marca del vehiculo
     * @param modelo del vehiculo
     * @param tipo del vehiculo
     * @param tipoCombustible del vehiculo
     * @param caballos del vehiculo
     * @param precio del vehiculo
     */
    public Vehiculo(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos, float precio, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.tipoCombustible = tipoCombustible;
        this.caballos = caballos;
        this.precio = precio;
        this.disponible = disponible;
    }

    /**
     * Metodo que obtiene la matricula del vehiculo
     * @return matricula
     */
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public int getCaballos() {
        return caballos;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Metodo que obtiene el precio del vehiculo
     * @return precio
     */
    public float getPrecio() { return precio; }

    /**
     * Metodo que osbreescribe la funcion equals
     * @param o vehiculo
     * @return TRUE si las matriculas coinciden o FALSE si las matriculas no coinciden
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return getMatricula().equals(vehiculo.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    /**
     * Metodo que sobreescribe la funcion toString()
     * @return los elementos del vehiculo en el formato que hemos definito
     */
    @Override
    public String toString() {
        return "matricula = '" + matricula + '\'' +
                ", marca = '" + marca + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", tipo = '" + tipo + '\'' +
                ", tipoCombustible = '" + tipoCombustible + '\'' +
                ", caballos = '" + caballos + '\'' +
                ", precio = '" + precio + '\'' +
                ", disponible = '" + disponible + '\'';
    }
}