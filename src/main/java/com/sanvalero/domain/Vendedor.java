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

    public float calcularSalarioMensual(ArrayList<Vendedor> vendedores, int id) {
        float salario = 0;
        for (int i = 0; i < vendedores.size(); i++) {
            if (vendedores.get(i).equals(id)) {
                Vendedor vendedor;
                vendedor = vendedores.get(i);
                salario = (float) (vendedor.getSueldo() + vendedor.getSueldo() * 0.2 * vendedor.getCochesVendidos());
            }
        }
        return salario;
    }

    public void venderCoche(ArrayList<Vendedor> vendedores, int id) {
        for (int i = 0; i < vendedores.size(); i++) {
            if (vendedores.get(i).equals(id)) {
                Vendedor vendedor;
                vendedor = vendedores.get(i);
                vendedor.setCochesVendidos(vendedor.getCochesVendidos() + 1);
            }
        }
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