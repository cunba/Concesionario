package com.sanvalero.aplicacion;

import com.sanvalero.domain.Coche;
import com.sanvalero.domain.Comprador;
import com.sanvalero.domain.Vendedor;

import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {
    private final Scanner leer;
    private boolean salir;
    private final ArrayList<Coche> coches;
    private final ArrayList<Comprador> compradores;
    private final ArrayList<Vendedor> vendedores;
    private int idCoche;
    private int idMoto;
    private int idVendedor;
    private int idComprador;
    private int idVenta;

    public Concesionario() {
        salir = false;
        leer = new Scanner(System.in);
        coches = new ArrayList<>();
        compradores = new ArrayList<>();
        vendedores = new ArrayList<>();
        idCoche = 0;
        idMoto = 0;
        idVendedor = 0;
        idComprador = 0;
        idVenta = 0;
    }

    public void menuInicial() {
        do {
            System.out.println(" ___________________________________________________________________________________________");
            System.out.println("|                                                                                           |");
            System.out.println("|                           MENÚ INICIAL DE GESTIÓN DE CONCESIONARIO                        |");
            System.out.println("|___________________________________________________________________________________________|");
            System.out.println(" ");
            System.out.println(" ACCIONES DE VENDEDOR: ");
            System.out.println("    1.  Visualizar coches");
            System.out.println("    2.  Visualizar motos");
            System.out.println("    3.  Comprar coche");
            System.out.println("    4.  Comprar moto");
            System.out.println("    5.  Registrar comprador");
            System.out.println("    6.  Visualizar comprador");
            System.out.println("    7.  Visualizar vendedor");
            System.out.println(" ");
            System.out.println(" ACCIONES DE ADMINISTRADOR:");
            System.out.println("    8.  Registrar coche");
            System.out.println("    9.  Registrar moto");
            System.out.println("   10.  Registrar comprador");
            System.out.println("   11.  Registrar vendedor");
            System.out.println("   12.  Registrar administrador");
            System.out.println(" ");
            System.out.println(" Si no desea realizar ninguna acción:");
            System.out.println("    S.  Salir.");
            System.out.println(" ");
            System.out.print("Por favor, seleccione la acción que desee realizar: ");
            String opcion = leer.nextLine();

            switch (opcion) {
                case "1":
                    verVehiculo("coche");
                    break;
                case "2":
                    verVehiculo("moto");
                    break;
                case "3":
                    comprarVehiculo("coche");
                    break;
                case "4":
                    comprarVehiculo("moto");
                    break;
                case "5": case "10":
                    registrarPersona("comprador");
                    break;
                case "6":
                    verPersona("comprador");
                    break;
                case "7":
                    verPersona("vendedor");
                    break;
                case "8":
                    registrarVehiculo("coche");
                    break;
                case "9":
                    registrarVehiculo("moto");
                    break;
                case "11":
                    registrarPersona("vendedor");
                    break;
                case "12":
                    registrarPersona("administrador");
                case "s": case "S":
                    salir();
                    break;
                default:
                    System.out.println("Opción incorrecta, inténtelo de nuevo.");
            }
        } while (!salir);
    }

    public void registrarVehiculo(String vehiculo) {
        System.out.println("Escriba a continuación los datos del coche:");
        System.out.print("ID: ");
        String id = leer.nextLine();
        System.out.print("Matricula: ");
        String matricula = leer.nextLine();
        System.out.print("Marca: ");
        String marca = leer.nextLine();
        System.out.print("Modelo: ");
        String modelo = leer.nextLine();
        System.out.print("Tipo: ");
        String tipo = leer.nextLine();
        System.out.print("Tipo de combustible: ");
        String tipoCombustible = leer.nextLine();
        System.out.print("Caballos: ");
        int caballos = leer.nextInt();
        System.out.print("Precio: ");
        float precio = leer.nextFloat();

        switch (vehiculo) {
            case "coche":
                System.out.print("Número de puertas: ");
                int nPuertas = leer.nextInt();
                System.out.print("Número de asientos: ");
                int nAsientos = leer.nextInt();



                Coche coche = new Coche(matricula, marca, modelo, tipo, tipoCombustible, caballos, nPuertas, nAsientos);
                coche.setPrecio(precio);

                coches.add(coche);
                break;

            case "moto":
                break;
        }

        System.out.println(" ");
        otraOperacion();
    }

    public void verVehiculo(String opcion) {
        System.out.println(" ");
        for (Coche coche : coches) {
            System.out.println(coche.toString());
        }
        System.out.println(" ");
        otraOperacion();
    }

    public void registrarPersona(String opcion) {
        System.out.println("Escriba a continuación los datos del vendedor: ");
        System.out.print("ID: ");
        int id = leer.nextInt();
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Apellido: ");
        String apellido = leer.nextLine();
        System.out.print("DNI: ");
        String dni = leer.nextLine();
        System.out.print("Teléfono: ");
        String telefono = leer.nextLine();
        System.out.print("Correo electrónico: ");
        String email = leer.nextLine();
        System.out.print("Sueldo: ");
        float sueldo = leer.nextFloat();
        System.out.println("Coches vendidos: ");
        int cochesVendidos = leer.nextInt();

        Vendedor vendedor = new Vendedor(id, nombre, apellido, dni, sueldo);
        vendedor.setCochesVendidos(cochesVendidos);

        vendedores.add(vendedor);

        System.out.println(" ");
        otraOperacion();
    }

    public void verPersona(String opcion) {
        System.out.println(" ");
        for(Vendedor vendedor: vendedores){
            System.out.println(vendedor.toString());
        }
        System.out.println(" ");
        otraOperacion();
    }

    public void comprarVehiculo(String opcion) {

    }

    private void otraOperacion() {
        System.out.print("¿Desea realizar otra operación?(S o N): ");
        String opcion = leer.nextLine();

        if (opcion.equalsIgnoreCase("n")) {
            salir();
        }
    }

    private void salir() {
        System.out.print("¿Está seguro que quiere salir de la aplicación?(S o N): ");
        String opcion = leer.nextLine();

        if (opcion.equalsIgnoreCase("s")) {
            System.out.println(" ");
            System.out.println("                                      FIN DE EJECUCIÓN");
            System.out.println("_____________________________________________________________________________________________");
            salir = true;
        }
    }
}
