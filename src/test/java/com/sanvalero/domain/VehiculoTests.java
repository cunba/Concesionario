package com.sanvalero.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class VehiculoTests {
    private static Vehiculo vehiculo;

    @BeforeAll
    public static void veforeAll() {
        vehiculo = new Vehiculo("0", "0", "0", "0", "0", 0, 0);
    }

    @Test
    public void equalsTest() {
        Vehiculo vehiculo1 = new Vehiculo("0", "0", "0", "0", "0", 0, 0);
        Assertions.assertTrue(vehiculo.equals(vehiculo1));

        Vehiculo vehiculo2 = new Vehiculo("1", "0", "0", "0", "0", 0, 0);
        Assertions.assertFalse(vehiculo.equals(vehiculo2));

        Vehiculo vehiculo3 = new Vehiculo("0", "1", "0", "0", "0", 0, 0);
        Assertions.assertTrue(vehiculo.equals(vehiculo3));
    }
}
