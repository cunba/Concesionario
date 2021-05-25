package com.sanvalero.domain;

import java.util.ArrayList;

public class Usuario extends Persona {
    public Usuario(int id, String nombre, String apellido, String dni, String telefono, String email) {
        super(id, nombre, apellido, dni, telefono, email);
    }

    public Coche elegirCoche(ArrayList<Coche> coches, String matricula) {
        Coche coche = new Coche(matricula, null, null, null, null, 0, 0, 0, 0);

        for (Coche coche1 : coches) {
            if (coche.equals(coche1)) {
                coche = coche1;
            }
        }

        return coche;
    }

    public Moto elegirMoto(ArrayList<Moto> motos, String matricula) {
        Moto moto = new Moto(matricula, null, null, null, null, 0, 0);

        for (Moto moto1 : motos) {
            if (moto.equals(moto1)) {
                moto = moto1;
            }
        }

        return moto;
    }
}
