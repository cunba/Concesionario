package com.sanvalero.domain;

import java.util.ArrayList;

public class Vendedor extends Usuario {
    private final float sueldo;
    private int cochesVendidos;
    private int idComprador;

    public Vendedor(int id, String nombre, String apellido, String dni, String telefono, String email, float sueldo) {
        super(id, nombre, apellido, dni, telefono, email);
        this.sueldo = sueldo;
        idComprador = 0;
    }

    public float getSueldo() {
        return sueldo;
    }

    public int getCochesVendidos() {
        return cochesVendidos;
    }

    public void setCochesVendidos(int cochesVendidos) {
        this.cochesVendidos = cochesVendidos;
    }

    @Override
    public String toString() {
        return "Vendedor {'" + '\'' +
                super.toString() +
                ", sueldo = '" + sueldo + '\'' +
                ", cochesVendidos = '" + cochesVendidos + '\'' +
                "}";
    }

    public float calcularSalarioMensual() {
        return (float) (sueldo + sueldo * 0.2 * cochesVendidos);
    }

    public void venderCoche() {
        cochesVendidos++;
    }

    public ArrayList<Comprador> registrarComprador(String nombre, String apellido, String dni, String telefono, String email, ArrayList<Comprador> compradores) {
        idComprador = compradores.size();

        Comprador comprador = new Comprador(idComprador, nombre, apellido, dni, telefono, email);
        comprador.setImporteTotalCompras(0);
        comprador.setCochesComprados(0);

        compradores.add(comprador);
        return compradores;
    }
}