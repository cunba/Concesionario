package com.sanvalero.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersonaTests {
    private static Persona persona;

    @BeforeAll
    public static void beforeAll() {
        persona = new Persona (0, "a", "b", "c", "d", "e");
    }

    @Test
    public void equalsTest() {
        Persona persona1 = new Persona (0, "a", "b", "c", "d", "e");
        Assertions.assertTrue(persona.equals(persona1));

        Persona persona2 = new Persona (1, "a", "b", "c", "d", "e");
        Assertions.assertFalse(persona.equals(persona2));

        Persona persona3 = new Persona (0, "a", "b", "c", "3", "t");
        Assertions.assertTrue(persona.equals(persona3));
    }
}
