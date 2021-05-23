package com.sanvalero.domain;

import java.util.Objects;

public class Vehiculo {
    private final String matricula;
    private final String marca;
    private final String modelo;
    private final String tipo;
    private final String tipoCombustible;
    private final int caballos;
    private float precio;

    public Vehiculo(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.tipoCombustible = tipoCombustible;
        this.caballos = caballos;
    }

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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

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

    @Override
    public String toString() {
        return "matricula = '" + matricula + '\'' +
                ", marca = '" + marca + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", tipo = '" + tipo + '\'' +
                ", tipoCombustible = '" + tipoCombustible + '\'' +
                ", caballos = '" + caballos + '\'' +
                ", precio = '" + precio + '\'';
    }
}