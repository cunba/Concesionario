package com.sanvalero.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CompradorTests {
    private static Comprador comprador;

    @BeforeAll
    public static void beforeAll() {
        comprador = new Comprador(0, "a", "b", "c", "d", "e");
    }

    @Test
    public void comprarVehiculoTest() {
        comprador.comprarVehiculo(1000);
        Assertions.assertEquals(1000, comprador.getImporteTotalCompras());
        Assertions.assertEquals(1, comprador.getVehiculosComprados());

        comprador.comprarVehiculo(2500);
        Assertions.assertEquals(3500, comprador.getImporteTotalCompras());
        Assertions.assertEquals(2, comprador.getVehiculosComprados());
    }
}
