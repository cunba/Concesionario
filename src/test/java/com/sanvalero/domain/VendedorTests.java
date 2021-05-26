package com.sanvalero.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class VendedorTests {
    private static Vendedor vendedor;

    @BeforeAll
    public static void beforeAll() {
        vendedor = new Vendedor(0, "a", "b", "c", "d", "e", 1000);
    }

    @Test
    public void venderVehiculo() {
        Assertions.assertEquals(1000, vendedor.calcularSalarioMensual());

        vendedor.venderVehiculo();
        Assertions.assertEquals(1, vendedor.getVehiculosVendidos());
        Assertions.assertEquals((1000+1000*0.2), vendedor.calcularSalarioMensual());

        vendedor.venderVehiculo();
        Assertions.assertEquals(2, vendedor.getVehiculosVendidos());
        Assertions.assertEquals((1000+1000*0.2*2), vendedor.calcularSalarioMensual());

        vendedor.venderVehiculo();
        Assertions.assertEquals(3, vendedor.getVehiculosVendidos());
        Assertions.assertEquals((1000+1000*0.2*3), vendedor.calcularSalarioMensual());
    }
}
