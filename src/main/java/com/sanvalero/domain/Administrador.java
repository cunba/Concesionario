package com.sanvalero.domain;

import java.util.ArrayList;

public class Administrador extends Persona {
    private final ArrayList<Vendedor> vendedores;
    private final ArrayList<Comprador> compradores;
    private final ArrayList<Administrador> administradores;
    private final ArrayList<Coche> coches;
    private final ArrayList<Moto> motos;
    private int idVendedor;
    private int idComprador;
    private int idAdministrador;

    public Administrador(int id, String nombre, String apellido, String dni, String telefono, String email) {
        super(id, nombre, apellido, dni, telefono, email);
        vendedores = new ArrayList<>();
        compradores = new ArrayList<>();
        administradores = new ArrayList<>();
        coches = new ArrayList<>();
        motos = new ArrayList<>();
        idVendedor = 0;
        idComprador = 0;
        idAdministrador = 0;
    }

    public void registrarVendedor(String nombre, String apellido, String dni, String telefono, String email, float sueldo) {
        idVendedor = vendedores.size();

        Vendedor vendedor = new Vendedor(idVendedor, nombre, apellido, dni, telefono, email, sueldo);
        vendedor.setCochesVendidos(0);

        vendedores.add(vendedor);
    }

    public void registrarComprador(String nombre, String apellido, String dni, String telefono, String email) {
        idComprador = compradores.size();

        Comprador comprador = new Comprador(idComprador, nombre, apellido, dni, telefono, email);
        comprador.setImporteTotalCompras(0);
        comprador.setCochesComprados(0);

        compradores.add(comprador);
    }

    public void registrarAdministrador(String nombre, String apellido, String dni, String telefono, String email) {
        idAdministrador = administradores.size();

        Administrador administrador = new Administrador(idAdministrador, nombre, apellido, dni, telefono, email);

        administradores.add(administrador);
    }

    public void registrarCoche(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos, int nPuertas, int nAsientos) {
        Coche coche = new Coche(matricula, marca, modelo, tipo, tipoCombustible, caballos, nPuertas, nAsientos);

        coches.add(coche);
    }

    public void registrarMoto(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos) {
        Moto moto = new Moto(matricula, marca, modelo, tipo, tipoCombustible, caballos);

        motos.add(moto);
    }

    public ArrayList<Comprador> mostrarCompradores() {
        return compradores;
    }

    public ArrayList<Coche> mostrarCoches() {
        return coches;
    }

    public ArrayList<Moto> mostrarMotos() {
        return motos;
    }

    @Override
    public String toString() {
        return "Administrador {" +
                super.toString() +
                "}";
    }
}
