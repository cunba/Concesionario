package com.sanvalero.domain;

public class Administrador extends Persona {
    public Administrador(int id, String nombre, String apellido, String dni, String telefono, String email) {
        super(id, nombre, apellido, dni, telefono, email);
    }

    public Vendedor registrarVendedor(int id, String nombre, String apellido, String dni, String telefono, String email, float sueldo) {
        Vendedor vendedor = new Vendedor(id, nombre, apellido, dni, telefono, email, sueldo);
        vendedor.setVehiculosVendidos(0);
        return vendedor;
    }

    public Comprador registrarComprador(int id, String nombre, String apellido, String dni, String telefono, String email) {
        Comprador comprador = new Comprador(id, nombre, apellido, dni, telefono, email);
        comprador.setImporteTotalCompras(0);
        comprador.setVehiculosComprados(0);
        return comprador;
    }

    public Administrador registrarAdministrador(int id, String nombre, String apellido, String dni, String telefono, String email) {
        return new Administrador(id, nombre, apellido, dni, telefono, email);
    }

    public Coche registrarCoche(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos, float precio, int nPuertas, int nAsientos) {
        return new Coche(matricula, marca, modelo, tipo, tipoCombustible, caballos, precio, nPuertas, nAsientos);
    }

    public Moto registrarMoto(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos, float precio) {
        return new Moto(matricula, marca, modelo, tipo, tipoCombustible, caballos, precio);
    }

    @Override
    public String toString() {
        return "Administrador {" +
                super.toString() +
                "}";
    }
}
