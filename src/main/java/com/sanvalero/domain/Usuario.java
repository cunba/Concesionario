package com.sanvalero.domain;

import java.util.ArrayList;

public class Usuario extends Persona {
    public Usuario(int id, String nombre, String apellido, String dni, String telefono, String email) {
        super(id, nombre, apellido, dni, telefono, email);
    }

    public Coche elegirCoche(ArrayList<Coche> coches, String matricula) {
        Coche coche = new Coche(null, null, null, null, null, 0, 0, 0);
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).equals(matricula)) {
                coche = coches.get(i);
            }
        }
        return coche;
    }

    public Moto elegirMoto(ArrayList<Moto> motos, String matricula) {
        Moto moto = new Moto(null, null, null, null, null, 0);
        for (int i = 0; i < motos.size(); i++) {
            if (motos.get(i).equals(matricula)) {
                moto = motos.get(i);
            }
        }
        return moto;
    }
}
