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
        Coche coche = new Coche("0", "a", "b", "c", "d", 0, 0, 0, 0);
        coches.add(coche);

        Coche coche1 = new Coche("1", "a", "b", "c", "d", 0, 0, 0, 0);
        coches.add(coche1);

        Coche coche2 = new Coche("2", "a", "b", "c", "d", 0, 0, 0, 0);
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
}
