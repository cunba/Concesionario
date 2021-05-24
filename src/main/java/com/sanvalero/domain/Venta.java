package com.sanvalero.domain;

import java.util.Objects;

public class Venta {
    private final int id;
    private final float importeVenta;
    private final String idVendedor;
    private final String idComprador;
    private final String matricula;

    public Venta(int id, float importeVenta, String idVendedor, String idComprador, String matricula) {
        this.id = id;
        this.importeVenta = importeVenta;
        this.idVendedor = idVendedor;
        this.idComprador = idComprador;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public float getImporteVenta() {
        return importeVenta;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public String getIdComprador() {
        return idComprador;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venta)) return false;
        Venta venta = (Venta) o;
        return getId() == venta.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Venta {" +
                "ID = '" + id + '\'' +
                ", importeVenta = '" + importeVenta + '\'' +
                ", idVendedor = '" + idVendedor + '\'' +
                ", idComprador = '" + idComprador + '\'' +
                ", matricula = '" + matricula + '\'' +
                '}';
    }
}