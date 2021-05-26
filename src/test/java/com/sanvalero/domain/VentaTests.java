package com.sanvalero.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class VentaTests {
    private static Venta venta;

    @BeforeAll
    public static void beforeAll() {
        venta = new Venta(0, 0, "0", 0, "0");
    }

    @Test
    public void equalsTest() {
        Venta venta1 = new Venta(0, 0, "0", 0, "0");
        Assertions.assertTrue(venta.equals(venta1));

        Venta venta2 = new Venta(1, 0, "0", 0, "0");
        Assertions.assertFalse(venta.equals(venta2));

        Venta venta3 = new Venta(0, 1, "0", 0, "0");
        Assertions.assertTrue(venta.equals(venta3));
    }
}
