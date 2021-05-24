package com.sanvalero.domain;

import java.util.ArrayList;

public class Administrador extends Persona {
    private int idVendedor;
    private int idComprador;
    private int idAdministrador;

    public Administrador(int id, String nombre, String apellido, String dni, String telefono, String email) {
        super(id, nombre, apellido, dni, telefono, email);
        idVendedor = 0;
        idComprador = 0;
        idAdministrador = 0;
    }

    public ArrayList<Vendedor> registrarVendedor(String nombre, String apellido, String dni, String telefono, String email, float sueldo, ArrayList<Vendedor> vendedores) {
        idVendedor = vendedores.size();

        Vendedor vendedor = new Vendedor(idVendedor, nombre, apellido, dni, telefono, email, sueldo);
        vendedor.setCochesVendidos(0);

        vendedores.add(vendedor);
        return vendedores;
    }

    public ArrayList<Comprador> registrarComprador(String nombre, String apellido, String dni, String telefono, String email, ArrayList<Comprador> compradores) {
        idComprador = compradores.size();

        Comprador comprador = new Comprador(idComprador, nombre, apellido, dni, telefono, email);
        comprador.setImporteTotalCompras(0);
        comprador.setCochesComprados(0);

        compradores.add(comprador);
        return compradores;
    }

    public ArrayList<Administrador> registrarAdministrador(String nombre, String apellido, String dni, String telefono, String email, ArrayList<Administrador> administradores) {
        idAdministrador = administradores.size();

        Administrador administrador = new Administrador(idAdministrador, nombre, apellido, dni, telefono, email);

        administradores.add(administrador);
        return administradores;
    }

    public ArrayList<Coche> registrarCoche(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos, int nPuertas, int nAsientos, ArrayList<Coche> coches) {
        Coche coche = new Coche(matricula, marca, modelo, tipo, tipoCombustible, caballos, nPuertas, nAsientos);

        coches.add(coche);
        return coches;
    }

    public ArrayList<Moto> registrarMoto(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos, ArrayList<Moto> motos) {
        Moto moto = new Moto(matricula, marca, modelo, tipo, tipoCombustible, caballos);

        motos.add(moto);
        return motos;
    }

    @Override
    public String toString() {
        return "Administrador {" +
                super.toString() +
                "}";
    }
}
