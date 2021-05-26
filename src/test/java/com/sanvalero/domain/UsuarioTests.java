package com.sanvalero.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class UsuarioTests {
    private static Usuario usuario;
    private static ArrayList<Coche> coches;
    private static ArrayList<Moto> motos;

    @BeforeAll
    public static void beforeAll() {
        usuario = new Usuario(0, "a", "b", "c", "d", "e");
        coches = new ArrayList<>();
        motos = new ArrayList<>();
    }

    @Test
    public void elegirCocheTest() {
        Coche coche = new Coche("0", "a", "b", "c", "d", 0, 0, true, 0, 0);
        coches.add(coche);

        Coche coche1 = new Coche("1", "a", "b", "c", "d", 0, 0, true, 0, 0);
        coches.add(coche1);

        Coche coche2 = new Coche("2", "a", "b", "c", "d", 0, 0, true, 0, 0);
        coches.add(coche2);

        Assertions.assertEquals(coche, usuario.elegirCoche(coches, "0"));
        Assertions.assertNotEquals(coche, usuario.elegirCoche(coches, "1"));
        Assertions.assertNotEquals(coche, usuario.elegirCoche(coches, "2"));

        Assertions.assertNotEquals(coche1, usuario.elegirCoche(coches, "0"));
        Assertions.assertEquals(coche1, usuario.elegirCoche(coches, "1"));
        Assertions.assertNotEquals(coche1, usuario.elegirCoche(coches, "2"));

        Assertions.assertNotEquals(coche2, usuario.elegirCoche(coches, "0"));
        Assertions.assertNotEquals(coche2, usuario.elegirCoche(coches, "1"));
        Assertions.assertEquals(coche2, usuario.elegirCoche(coches, "2"));
    }

    @Test
    public void elegirMotoTest() {
        Moto moto = new Moto("0", "a", "b", "c", "d", 0, 0, true);
        motos.add(moto);

        Moto moto1 = new Moto("1", "a", "b", "c", "d", 0, 0, true);
        motos.add(moto1);

        Moto moto2 = new Moto("2", "a", "b", "c", "d", 0, 0, true);
        motos.add(moto2);

        Assertions.assertEquals(moto, usuario.elegirMoto(motos, "0"));
        Assertions.assertNotEquals(moto, usuario.elegirMoto(motos, "1"));
        Assertions.assertNotEquals(moto, usuario.elegirMoto(motos, "2"));

        Assertions.assertNotEquals(moto1, usuario.elegirMoto(motos, "0"));
        Assertions.assertEquals(moto1, usuario.elegirMoto(motos, "1"));
        Assertions.assertNotEquals(moto1, usuario.elegirMoto(motos, "2"));

        Assertions.assertNotEquals(moto2, usuario.elegirMoto(motos, "0"));
        Assertions.assertNotEquals(moto2, usuario.elegirMoto(motos, "1"));
        Assertions.assertEquals(moto2, usuario.elegirMoto(motos, "2"));
    }
}
