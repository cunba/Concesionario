package com.sanvalero.domain;

import java.util.Objects;

/**
 * Clase correspondiente a venta
 */
public class Venta {
    //Definimos los elementos de venta
    private final int id;
    private final float importeVenta;
    private final String idVendedor;
    private final int idComprador;
    private final String matricula;

    /**
     * Constructor de venta
     * @param id de la venta
     * @param importeVenta de la venta
     * @param idVendedor de la venta
     * @param idComprador de la venta
     * @param matricula de la venta
     */
    public Venta(int id, float importeVenta, String idVendedor, int idComprador, String matricula) {
        this.id = id;
        this.importeVenta = importeVenta;
        this.idVendedor = idVendedor;
        this.idComprador = idComprador;
        this.matricula = matricula;
    }

    /**
     * Metodo que obtiene el ID de la venta
     * @return ID de la venta
     */
    public int getId() {
        return id;
    }

    public float getImporteVenta() {
        return importeVenta;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public String getMatricula() {
        return matricula;
    }

    /**
     * Metodo que sobreescribe la funcion equals()
     * @param o venta
     * @return TRUE si los IDs coincide o FALSe si los IDs no coincide
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venta)) return false;
        Venta venta = (Venta) o;
        return getId() == venta.getId();
    }

    /**
     * Metodo que sobreescribe la funcion hashCode()
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    /**
     * Metodo que sobreescribe la funcion toString()
     * @return la venta en el formato que hemos definido
     */
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