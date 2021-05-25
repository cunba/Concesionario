package com.sanvalero.domain;

public class Moto extends Vehiculo {
    public Moto(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos, float precio) {
        super(matricula, marca, modelo, tipo, tipoCombustible, caballos, precio);
    }

    @Override
    public String toString() {
        return "Moto {" + '\'' +
                super.toString() +
                "}";
    }
}