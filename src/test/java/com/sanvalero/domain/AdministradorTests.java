package com.sanvalero.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AdministradorTests {
    private static Administrador administrador;

    @BeforeAll
    public static void beforeAll() {
        administrador = new Administrador(0, "a", "b", "c", "d", "e");
    }

    @Test
    public void registrarVendedorTest() {
        Assertions.assertNotNull(administrador.registrarVendedor(0, "a", "b", "c", "d", "e", 0));

        Vendedor vendedor = new Vendedor(0, "a", "b", "c", "d", "e", 0);
        Assertions.assertEquals(vendedor, administrador.registrarVendedor(0, "a", "b", "c", "d", "e", 0));

        Vendedor vendedor1 = new Vendedor(0, "4", "4", "4", "4", "4", 0);
        Assertions.assertEquals(vendedor1, administrador.registrarVendedor(0, "4", "4", "4", "4", "4", 0));
    }

    @Test
    public void resgistrarAdministrador() {
        Assertions.assertNotNull(administrador.registrarAdministrador(0, "a", "b", "c", "d", "e"));

        administrador = new Administrador(0, "a", "b", "c", "d", "e");
        Assertions.assertEquals(administrador, administrador.registrarAdministrador(0, "a", "b", "c", "d", "e"));

        Administrador administrador1 = new Administrador(0, "1", "1", "1", "1", "1");
        Assertions.assertEquals(administrador1, administrador.registrarAdministrador(0, "1", "1", "1", "1", "1"));
    }

    @Test
    public void resgistrarCoche() {
        Assertions.assertNotNull(administrador.registrarCoche("0", "a", "b", "c", "d", 0, 0, 0, 0));

        Coche coche = new Coche("0", "a", "b", "c", "d", 0, 0, 0, 0);
        Assertions.assertEquals(coche, administrador.registrarCoche("0", "a", "b", "c", "d", 0, 0, 0, 0));

        Coche coche1 = new Coche("1", "1", "1", "1", "1", 0, 0, 0, 0);
        Assertions.assertEquals(coche1, administrador.registrarCoche("1", "1", "1", "1", "1", 0, 0, 0, 0));
    }

    @Test
    public void resgistrarMoto() {
        Assertions.assertNotNull(administrador.registrarMoto("0", "a", "b", "c", "d", 0, 0));

        Moto moto = new Moto("0", "a", "b", "c", "d", 0, 0);
        Assertions.assertEquals(moto, administrador.registrarMoto("0", "a", "b", "c", "d", 0, 0));

        Moto moto1 = new Moto("1", "1", "1", "1", "1", 0, 0);
        Assertions.assertEquals(moto1, administrador.registrarMoto("1", "1", "1", "1", "1", 0, 0));
    }
}
