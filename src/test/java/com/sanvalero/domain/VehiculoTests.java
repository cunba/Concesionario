package com.sanvalero.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class VehiculoTests {
    private static Vehiculo vehiculo;

    @BeforeAll
    public static void beforeAll() {
        vehiculo = new Vehiculo("0", "0", "0", "0", "0", 0, 0, true);
    }

    @Test
    public void equalsTest() {
        Vehiculo vehiculo1 = new Vehiculo("0", "0", "0", "0", "0", 0, 0, true);
        Assertions.assertEquals(true, vehiculo.equals(vehiculo1));

        Vehiculo vehiculo2 = new Vehiculo("1", "0", "0", "0", "0", 0, 0, true);
        Assertions.assertFalse(vehiculo.equals(vehiculo2));

        Vehiculo vehiculo3 = new Vehiculo("0", "1", "0", "0", "0", 0, 0, true);
        Assertions.assertTrue(vehiculo.equals(vehiculo3));
    }
}
