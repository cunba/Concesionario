package com.sanvalero.aplicacion;

import com.sanvalero.domain.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {
    private final Scanner leer;
    private boolean salir;
    private final ArrayList<Coche> coches;
    private final ArrayList<Moto> motos;
    private final ArrayList<Comprador> compradores;
    private final ArrayList<Vendedor> vendedores;
    private final ArrayList<Administrador> administradores;
    private final ArrayList<Venta> ventas;

    public Concesionario() {
        salir = false;
        leer = new Scanner(System.in);
        coches = new ArrayList<>();
        motos = new ArrayList<>();
        compradores = new ArrayList<>();
        vendedores = new ArrayList<>();
        administradores = new ArrayList<>();
        ventas = new ArrayList<>();

        //Creamos el administrador jefe
        Administrador administrador = new Administrador(0, null, null, null, null, null);
        administradores.add(administrador);
    }

    public void menuInicial() {
        do {
            System.out.println(" ___________________________________________________________________________________________");
            System.out.println("|                                                                                           |");
            System.out.println("|                           MENÚ INICIAL DE GESTIÓN DE CONCESIONARIO                        |");
            System.out.println("|___________________________________________________________________________________________|");
            System.out.println(" ");
            System.out.println(" ACCIONES DE USUARIO: ");
            System.out.println("    1.  Visualizar coches");
            System.out.println("    2.  Visualizar motos");
            System.out.println(" ");
            System.out.println(" ACCIONES DE COMPRADOR: ");
            System.out.println("    3.  Comprar coche (se necesita estar registrado)");
            System.out.println("    4.  Comprar moto (se necesita estar registrado)");
            System.out.println("    5.  Registrarse");
            System.out.println("    6.  Ver información de usuario");
            System.out.println(" ");
            System.out.println(" ACCIONES DE VENDEDOR: ");
            System.out.println("    7.  Vender coche");
            System.out.println("    8.  Vender moto");
            System.out.println("    9.  Visualizar compradores");
            System.out.println("   10.  Ver información de usuario");
            System.out.println("   11.  Cálculo de salario mensual");
            System.out.println(" ");
            System.out.println(" ACCIONES DE ADMINISTRADOR:");
            System.out.println("   12.  Registrar coche");
            System.out.println("   13.  Registrar moto");
            System.out.println("   14.  Registrar vendedor");
            System.out.println("   15.  Registrar administrador");
            System.out.println("   16.  Visualizar administradores");
            System.out.println("   17.  Visualizar compradores");
            System.out.println("   18.  Visualizar vendedores");
            System.out.println("   19.  Visualizar ventas");
            System.out.println("   20.  Ver información de usuario");
            System.out.println(" ");
            System.out.println(" Si no desea realizar ninguna acción:");
            System.out.println("    S.  Salir.");
            System.out.println(" ");
            System.out.print("Por favor, seleccione la acción que desea realizar: ");
            String opcion = leer.nextLine();

            switch (opcion) {
                case "1":
                    ver("coches");
                    break;
                case "2":
                    ver("motos");
                    break;
                case "3":
                    comprarVehiculo("coche");
                    break;
                case "4":
                    comprarVehiculo("moto");
                    break;
                case "5":
                    registrarComprador();
                    break;
                case "6":
                    ver("comprador");
                    break;
                case "7":
                    venderVehiculo("coche");
                    break;
                case "8":
                    venderVehiculo("moto");
                    break;
                case "9": case "17":
                    ver("compradores");
                    break;
                case "10": case "18":
                    ver("vendedor");
                    break;
                case "11":
                    calcularSalarioVendedor();
                    break;
                case "12":
                    registrarVehiculo("coche");
                    break;
                case "13":
                    registrarVehiculo("moto");
                    break;
                case "14":
                    registrarPersona("vendedor");
                    break;
                case "15":
                    registrarPersona("administrador");
                    break;
                case "16":
                    ver("administradores");
                    break;
                case "19":
                    ver("ventas");
                    break;
                case "20":
                    ver("administrador");
                    break;
                case "s": case "S":
                    salir();
                    break;
                default:
                    System.out.println("Opción incorrecta, inténtelo de nuevo.");
            }
        } while (!salir);
    }

    public void registrarVehiculo(String vehiculo) {
        System.out.print("Introduzca su ID de administrador: ");
        int id = leer.nextInt();
        boolean idValido = false;
        Administrador administrador = new Administrador(id, null, null, null, null, null);

        for (int i = 0; i < administradores.size() || !idValido; i++) {
            if (administrador.equals(administradores.get(i))) {
                administrador = administradores.get(i);
                idValido = true;
            }
        }

        System.out.println(" ");
        if (idValido) {
            System.out.println("Escriba a continuación los datos del vehículo:");
            System.out.print("- Matrícula: ");
            String matricula = leer.nextLine();
            System.out.print("- Marca: ");
            String marca = leer.nextLine();
            System.out.print("- Modelo: ");
            String modelo = leer.nextLine();
            System.out.print("- Tipo: ");
            String tipo = leer.nextLine();
            System.out.print("- Tipo de combustible: ");
            String tipoCombustible = leer.nextLine();
            System.out.print("- Caballos: ");
            int caballos = leer.nextInt();
            System.out.print("- Precio: ");
            float precio = leer.nextFloat();

            switch (vehiculo) {
                case "coche":
                    System.out.print("- Número de puertas: ");
                    int nPuertas = leer.nextInt();
                    System.out.print("- Número de asientos: ");
                    int nAsientos = leer.nextInt();

                    coches.add(administrador.registrarCoche(matricula, marca, modelo, tipo, tipoCombustible, caballos, precio, nPuertas, nAsientos));

                    System.out.println(" ");
                    System.out.println("El coche ha sido registrado con éxito.");
                    break;

                case "moto":
                    motos.add(administrador.registrarMoto(matricula, marca, modelo, tipo, tipoCombustible, caballos, precio));

                    System.out.println(" ");
                    System.out.println("La moto ha sido registrada con éxito.");
                    break;
            }
        } else {
            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
        }


        System.out.println(" ");
        otraOperacion();
    }

    public void ver(String opcion) {
        int id;
        boolean idValido;
        Administrador administrador;
        switch (opcion) {
            case "coches":
                System.out.println(" ");
                for (Coche coche : coches) {
                    System.out.println(coche.toString());
                }
                break;

            case "motos":
                System.out.println(" ");
                for (Moto moto : motos) {
                    System.out.println(moto.toString());
                }
                break;

            case "administradores":
                System.out.print("Introduzca su ID de administrador: ");
                id = leer.nextInt();
                idValido = false;
                administrador = new Administrador(id, null, null, null, null, null);

                for (int i = 0; i < administradores.size() || !idValido; i++) {
                    idValido = administrador.equals(administradores.get(i));
                }

                System.out.println(" ");
                if (idValido) {
                    for(Administrador administrador1: administradores){
                        System.out.println(administrador1.toString());
                    }
                } else {
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "compradores":
                System.out.print("Introduzca su ID: ");
                id = leer.nextInt();
                idValido = false;
                administrador = new Administrador(id, null, null, null, null, null);

                for (int i = 0; i < administradores.size() || !idValido; i++) {
                    idValido = administrador.equals(administradores.get(i));
                }

                if (!idValido) {
                    Vendedor vendedor = new Vendedor(id, null, null, null, null, null, 0);
                    for (int i = 0; i < vendedores.size() || !idValido; i++) {
                        idValido = vendedor.equals(vendedores.get(i));
                    }
                }

                System.out.println(" ");
                if (idValido) {
                    for(Comprador comprador: compradores){
                        System.out.println(comprador.toString());
                    }
                } else {
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "vendedores":
                System.out.print("Introduzca su ID: ");
                id = leer.nextInt();
                idValido = false;
                administrador = new Administrador(id, null, null, null, null, null);

                for (int i = 0; i < administradores.size() || !idValido; i++) {
                    idValido = administrador.equals(administradores.get(i));
                }

                if (!idValido) {
                    Vendedor vendedor = new Vendedor(id, null, null, null, null, null, 0);
                    for (int i = 0; i < vendedores.size() || !idValido; i++) {
                        idValido = vendedor.equals(vendedores.get(i));
                    }
                }

                System.out.println(" ");
                if (idValido) {
                    for(Vendedor vendedor1: vendedores){
                        System.out.println(vendedor1.toString());
                    }
                } else {
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "ventas":
                System.out.print("Introduzca su ID de administrador: ");
                id = leer.nextInt();
                idValido = false;
                administrador = new Administrador(id, null, null, null, null, null);

                for (int i = 0; i < administradores.size() || !idValido; i++) {
                    idValido = administrador.equals(administradores.get(i));
                }

                System.out.println(" ");
                if (idValido) {
                    for(Venta venta: ventas){
                        System.out.println(venta.toString());
                    }
                } else {
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "comprador":
                System.out.print("Introduzca su ID: ");
                id = leer.nextInt();
                idValido = false;
                Comprador comprador = new Comprador(id, null, null, null, null, null);

                for (int i = 0; i < compradores.size() || !idValido; i++) {
                    if (comprador.equals(compradores.get(i))) {
                        comprador = compradores.get(i);
                        idValido = true;
                    }
                }

                System.out.println(" ");
                if (idValido) {
                    System.out.println(comprador.toString());
                } else {
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "vendedor":
                System.out.print("Introduzca su ID: ");
                id = leer.nextInt();
                idValido = false;
                Vendedor vendedor = new Vendedor(id, null, null, null, null, null, 0);

                for (int i = 0; i < vendedores.size() || !idValido; i++) {
                    if (vendedor.equals(vendedores.get(i))) {
                        vendedor = vendedores.get(i);
                        idValido = true;
                    }
                }

                System.out.println(" ");
                if (idValido) {
                    System.out.println(vendedor.toString());
                } else {
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "administrador":
                System.out.print("Introduzca su ID: ");
                id = leer.nextInt();
                idValido = false;
                administrador = new Administrador(id, null, null, null, null, null);

                for (int i = 0; i < administradores.size() || !idValido; i++) {
                    if (administrador.equals(administradores.get(i))) {
                        administrador = administradores.get(i);
                        idValido = true;
                    }
                }

                System.out.println(" ");
                if (idValido) {
                    System.out.println(administrador.toString());
                } else {
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;
        }
        System.out.println(" ");
        otraOperacion();
    }

    public void registrarPersona(String persona) {
        System.out.print("Introduzca su ID de administrador: ");
        int id = leer.nextInt();
        boolean idValido = false;
        Administrador administrador = new Administrador(id, null, null, null, null, null);

        for (int i = 0; i < administradores.size() || !idValido; i++) {
            if (administrador.equals(administradores.get(i))) {
                administrador = administradores.get(i);
                idValido = true;
            }
        }

        System.out.println(" ");
        if (idValido) {
            System.out.println("Escriba a continuación los datos de la persona: ");
            System.out.print("- Nombre: ");
            String nombre = leer.nextLine();
            System.out.print("- Apellido: ");
            String apellido = leer.nextLine();
            System.out.print("- DNI: ");
            String dni = leer.nextLine();
            System.out.print("- Teléfono: ");
            String telefono = leer.nextLine();
            System.out.print("- Correo electrónico: ");
            String email = leer.nextLine();

            switch (persona) {
                case "administrador":
                    int idAdministrador = administradores.size();
                    administradores.add(administrador.registrarAdministrador(idAdministrador, nombre, apellido, dni, telefono, email));

                    System.out.println(" ");
                    System.out.println("El administrador ha sido registrado con éxito.");
                    break;

                case "vendedor":
                    System.out.println("Sueldo: ");
                    float sueldo = leer.nextFloat();

                    int idVendedor = vendedores.size();
                    vendedores.add(administrador.registrarVendedor(idVendedor, nombre, apellido, dni, telefono, email, sueldo));

                    System.out.println(" ");
                    System.out.println("El vendedor ha sido registrado con éxito.");
                    break;

                case "comprador":
                    int idComprador = compradores.size();
                    compradores.add(administrador.registrarComprador(idComprador, nombre, apellido, dni, telefono, email));

                    System.out.println(" ");
                    System.out.println("El comprador ha sido registrado con éxito.");
                    break;
            }
        } else {
            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
        }

        System.out.println(" ");
        otraOperacion();
    }

    public void registrarComprador() {
        System.out.println("Escriba a continuación los datos de la persona: ");
        System.out.print("- Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("- Apellido: ");
        String apellido = leer.nextLine();
        System.out.print("- DNI: ");
        String dni = leer.nextLine();
        System.out.print("- Teléfono: ");
        String telefono = leer.nextLine();
        System.out.print("- Correo electrónico: ");
        String email = leer.nextLine();

        int idComprador = compradores.size();
        Comprador comprador = new Comprador(idComprador, nombre, apellido, dni, telefono, email);
        compradores.add(comprador);

        System.out.println(" ");
        System.out.println("Se ha registrado con éxito.");
    }

    public void comprarVehiculo(String vehiculo) {
        System.out.print("Introduzca su ID de usuario: ");
        int id = leer.nextInt();
        boolean idValido = false;
        Comprador comprador = new Comprador(id, null, null, null, null, null);

        for (int i = 0; i < compradores.size() || !idValido; i++) {
            if (comprador.equals(compradores.get(i))) {
                comprador = compradores.get(i);
                idValido = true;
            }
        }

        if (idValido) {
            String matricula;
            switch (vehiculo) {
                case "coche":
                    System.out.println(" ");
                    System.out.println("Estos son los coches disponibles: ");
                    ver("coches");
                    System.out.println(" ");
                    System.out.print("Indique la matrícula del coche que desea comprar: ");
                    matricula = leer.nextLine();

                    Coche coche = comprador.elegirCoche(coches, matricula);

                    if (coche == null) {
                        System.out.println(" ");
                        System.out.println("Lo siento, el coche elegido no existe. Inténtelo de nuevo");
                    } else {
                        int idVenta = ventas.size();
                        Venta venta = new Venta(idVenta, coche.getPrecio(), null, String.valueOf(id), coche.getMatricula());
                        ventas.add(venta);

                        comprador.comprarVehiculo(coche.getPrecio());

                        System.out.println(" ");
                        System.out.println("La venta se ha registrado con éxito.");
                    }
                    break;

                case "moto":
                    System.out.println(" ");
                    System.out.println("Estas son las motos disponibles: ");
                    ver("motos");
                    System.out.println(" ");
                    System.out.print("Indique la matrícula de la moto que desea comprar: ");
                    matricula = leer.nextLine();

                    Moto moto = comprador.elegirMoto(motos, matricula);

                    if (moto == null) {
                        System.out.println(" ");
                        System.out.println("Lo siento, la moto elegida no existe. Inténtelo de nuevo");
                    } else {
                        int idVenta = ventas.size();
                        Venta venta = new Venta(idVenta, moto.getPrecio(), null, String.valueOf(id), moto.getMatricula());
                        ventas.add(venta);

                        comprador.comprarVehiculo(moto.getPrecio());

                        System.out.println(" ");
                        System.out.println("La venta se ha registrado con éxito.");
                    }
                    break;
            }
        } else {
            System.out.println(" ");
            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
        }
        System.out.println(" ");
        otraOperacion();
    }

    public void venderVehiculo(String vehiculo) {
        System.out.print("Introduzca su ID de vendedor: ");
        int id = leer.nextInt();
        boolean idValido = false;
        Vendedor vendedor = new Vendedor(id, null, null, null, null, null, 0);

        for (int i = 0; i < vendedores.size() || !idValido; i++) {
            if (vendedor.equals(vendedores.get(i))) {
                vendedor = vendedores.get(i);
                idValido = true;
            }
        }

        if (idValido) {
            String matricula;
            switch (vehiculo) {
                case "coche":
                    System.out.println(" ");
                    System.out.println("Estos son los coches disponibles: ");
                    ver("coches");
                    System.out.println(" ");
                    System.out.print("Indique la matrícula del coche que desea vender: ");
                    matricula = leer.nextLine();

                    Coche coche = vendedor.elegirCoche(coches, matricula);

                    if (coche == null) {
                        System.out.println(" ");
                        System.out.println("Lo siento, el coche elegido no existe. Inténtelo de nuevo");
                    } else {
                        int idVenta = ventas.size();
                        Venta venta = new Venta(idVenta, coche.getPrecio(), null, String.valueOf(id), coche.getMatricula());
                        ventas.add(venta);

                        vendedor.venderVehiculo();

                        System.out.println(" ");
                        System.out.println("La venta se ha registrado con éxito.");
                    }
                    break;

                case "moto":
                    System.out.println(" ");
                    System.out.println("Estos son las motos disponibles: ");
                    ver("motos");
                    System.out.println(" ");
                    System.out.print("Indique la matrícula de la moto que desea vender: ");
                    matricula = leer.nextLine();

                    Moto moto = vendedor.elegirMoto(motos, matricula);

                    if (moto == null) {
                        System.out.println(" ");
                        System.out.println("Lo siento, la moto elegida no existe. Inténtelo de nuevo");
                    } else {
                        int idVenta = ventas.size();
                        Venta venta = new Venta(idVenta, moto.getPrecio(), null, String.valueOf(id), moto.getMatricula());
                        ventas.add(venta);

                        vendedor.venderVehiculo();

                        System.out.println(" ");
                        System.out.println("La venta se ha registrado con éxito.");
                    }
                    break;
            }
        } else {
            System.out.println(" ");
            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
        }
        System.out.println(" ");
        otraOperacion();
    }

    public void calcularSalarioVendedor() {
        System.out.print("Introduzca su ID de vendedor: ");
        int id = leer.nextInt();
        boolean idValido = false;
        Vendedor vendedor = new Vendedor(id, null, null, null, null, null, 0);

        for (int i = 0; i < vendedores.size() || !idValido; i++) {
            if (vendedor.equals(vendedores.get(i))) {
                vendedor = vendedores.get(i);
                idValido = true;
            }
        }

        if (idValido) {
            float salario = vendedor.calcularSalarioMensual();
            System.out.println(" ");
            System.out.println("Su salario mensual es de " + salario + "€.");
        } else {
            System.out.println(" ");
            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
        }

        System.out.println(" ");
        otraOperacion();
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
