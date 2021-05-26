package com.sanvalero.domain;

import java.util.ArrayList;

/**
 * Clase correspondiente a Usuario. Es una clase que hereda de Persona y a su vez es madre de Comprador y Vendedor
 */
public class Usuario extends Persona {
    /**
     * Constructor de usuario
     * @param id del usuario
     * @param nombre del usuario
     * @param apellido del usuario
     * @param dni del usuario
     * @param telefono del usuario
     * @param email del usuario
     */
    public Usuario(int id, String nombre, String apellido, String dni, String telefono, String email) {
        super(id, nombre, apellido, dni, telefono, email);
    }

    /**
     * Elige el coche que corresponde a la matricula introducida
     * @param coches Lista de todos los coches
     * @param matricula del coche que queremos elegir
     * @return el coche con esa matricula
     */
    public Coche elegirCoche(ArrayList<Coche> coches, String matricula) {
        Coche coche = null;

        for (Coche coche1 : coches) {
            if (coche1.getMatricula().equals(matricula)) {
                coche = coche1;
                break;
            }
        }

        return coche;
    }

    /**
     * Elige la moto que corresponde a la matricula introducida
     * @param motos Lista de todas las motos
     * @param matricula de la moto que queremos elegir
     * @return la moto con esa matricula
     */
    public Moto elegirMoto(ArrayList<Moto> motos, String matricula) {
        Moto moto = null;

        for (Moto moto1 : motos) {
            if (moto1.getMatricula().equals(matricula)) {
                moto = moto1;
            }
        }

        return moto;
    }
}
