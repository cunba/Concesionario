package com.sanvalero.domain;

/**
 * Clase correspondiente al administrador. Es una clase que hereda de Persona.
 */
public class Administrador extends Persona {
    /**
     * Constructor de administrador
     * @param id del administrador
     * @param nombre del administrador
     * @param apellido del administrador
     * @param dni del administrador
     * @param telefono del administrador
     * @param email del administrador
     */
    public Administrador(int id, String nombre, String apellido, String dni, String telefono, String email) {
        super(id, nombre, apellido, dni, telefono, email);
    }

    /**
     * Metodo que crea un vendedor. Para ello obtenemos la informacion de la persona
     * @param id del vendedor
     * @param nombre del vendedor
     * @param apellido del vendedor
     * @param dni del vendedor
     * @param telefono del vendedor
     * @param email del vendedor
     * @param sueldo del vendedor
     * @return devuelve el vendedor ya creado
     */
    public Vendedor registrarVendedor(int id, String nombre, String apellido, String dni, String telefono, String email, float sueldo) {
        Vendedor vendedor = new Vendedor(id, nombre, apellido, dni, telefono, email, sueldo);
        vendedor.setVehiculosVendidos(0);
        return vendedor;
    }

    /**
     * Metodo que crea un administrador. Para ello obtenemos la informacion de la persona
     * @param id del administrador
     * @param nombre del administrador
     * @param apellido del administrador
     * @param dni del administrador
     * @param telefono del administrador
     * @param email del administrador
     * @return devuelve el administrador creado
     */
    public Administrador registrarAdministrador(int id, String nombre, String apellido, String dni, String telefono, String email) {
        return new Administrador(id, nombre, apellido, dni, telefono, email);
    }

    /**
     * Metodo que crea un coche. Para ello obtenemos la informacion del vehiculo
     * @param matricula del coche
     * @param marca del coche
     * @param modelo del coche
     * @param tipo del coche
     * @param tipoCombustible del coche
     * @param caballos del coche
     * @param precio del coche
     * @param nPuertas del coche
     * @param nAsientos del coche
     * @return devuelve el coche creado
     */
    public Coche registrarCoche(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos, float precio, int nPuertas, int nAsientos) {
        return new Coche(matricula, marca, modelo, tipo, tipoCombustible, caballos, precio, nPuertas, nAsientos);
    }

    /**
     * Metodo que crea una moto. Para ello obtenemos la informacion del vehiculo
     * @param matricula de la moto
     * @param marca de la moto
     * @param modelo de la moto
     * @param tipo de la moto
     * @param tipoCombustible de la moto
     * @param caballos de la moto
     * @param precio de la moto
     * @return devuelve la moto ya creada
     */
    public Moto registrarMoto(String matricula, String marca, String modelo, String tipo, String tipoCombustible, int caballos, float precio) {
        return new Moto(matricula, marca, modelo, tipo, tipoCombustible, caballos, precio);
    }

    /**
     * Metodo que sobreescribe la funcion toString()
     * @return el administrador en el formato que hemos definido
     */
    @Override
    public String toString() {
        return "Administrador { " +
                super.toString() +
                " }";
    }
}
