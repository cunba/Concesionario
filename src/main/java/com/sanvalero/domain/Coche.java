package com.sanvalero.domain;

public class Coche extends Vehiculo {
    private final int nPuertas;
    private final int nAsientos;

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

    @Override
    public String toString() {
        return "Coche {" + '\'' +
                super.toString() +
                ", nPuertas = '" + nPuertas + '\'' +
                ", nAsientos = '" + nAsientos + '\'' +
                '}';
    }
}