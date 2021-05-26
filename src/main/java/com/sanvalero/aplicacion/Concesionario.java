package com.sanvalero.aplicacion;

import com.sanvalero.domain.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que controla las diferentes acciones de la aplicacion
 */
public class Concesionario {
    //Declaracion de utilidades
    private final Scanner leer;

    //Declaracion de listas donde guardaremos los vehiculos y las personas
    private final ArrayList<Coche> coches;
    private final ArrayList<Moto> motos;
    private final ArrayList<Comprador> compradores;
    private final ArrayList<Vendedor> vendedores;
    private final ArrayList<Administrador> administradores;
    private final ArrayList<Venta> ventas;

    //Declaracion de constantes
    private boolean salir;

    public Concesionario() {
        salir = false;
        leer = new Scanner(System.in);
        coches = new ArrayList<>();
        motos = new ArrayList<>();
        compradores = new ArrayList<>();
        vendedores = new ArrayList<>();
        administradores = new ArrayList<>();
        ventas = new ArrayList<>();

        //Creación del administrador jefe
        Administrador administrador = new Administrador(0, null, null, null, null, null);
        administradores.add(administrador);
    }

    /**
     * Metodo de menu inicial donde se muestran las acciones de la aplicacion y se pide al usuario que elija una de ellas
     */
    public void menuInicial() {
        do {
            System.out.println(" ___________________________________________________________________________________________");
            System.out.println("|                                                                                           |");
            System.out.println("|                           MENÚ INICIAL DE GESTIÓN DE CONCESIONARIO                        |");
            System.out.println("|___________________________________________________________________________________________|");
            System.out.println();
            System.out.println(" ACCIONES DE USUARIO: ");
            System.out.println("    1.  Visualizar coches disponibles");
            System.out.println("    2.  Visualizar motos disponibles");
            System.out.println();
            System.out.println(" ACCIONES DE COMPRADOR: ");
            System.out.println("    3.  Comprar coche (se necesita estar registrado)");
            System.out.println("    4.  Comprar moto (se necesita estar registrado)");
            System.out.println("    5.  Registrarse");
            System.out.println("    6.  Ver información de usuario");
            System.out.println();
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
            System.out.println("   20.  Visualizar todos los coches");
            System.out.println("   21.  Visualizar todas las motos");
            System.out.println("   22.  Ver información de usuario");
            System.out.println();
            System.out.println(" Si no desea realizar ninguna acción:");
            System.out.println("    S.  Salir.");
            System.out.println();
            System.out.print("Por favor, seleccione la acción que desea realizar: ");
            String opcion = leer.nextLine();

            switch (opcion) {
                case "1":
                    ver("coches", "");
                    break;
                case "2":
                    ver("motos", "");
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
                    ver("comprador", "");
                    break;
                case "7":
                    venderVehiculo("coche");
                    break;
                case "8":
                    venderVehiculo("moto");
                    break;
                case "9":
                    ver("compradores", "vendedor");
                    break;
                case "10":
                    ver("vendedor", "");
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
                    ver("administradores", "");
                    break;
                case "17":
                    ver("compradores", "administrador");
                    break;
                case "18":
                    ver("vendedores", "");
                    break;
                case "19":
                    ver("ventas", "");
                    break;
                case "20":
                    ver("coches", "administrador");
                    break;
                case "21":
                    ver("motos", "administrador");
                    break;
                case "22":
                    ver("administrador", "");
                    break;
                case "s": case "S":
                    salir();
                    break;
                default:
                    System.out.println("Opción incorrecta, inténtelo de nuevo.");
                    otraOperacion();
            }
        } while (!salir);
    }

    /**
     * Método que registra los vehiculos. Para poder registrarlos hay que ser un administrador
     * @param vehiculo tipo de vehiculo que se va a registrar (coche o moto)
     */
    public void registrarVehiculo(String vehiculo) {
        try {
            System.out.print("Introduzca su ID de administrador: ");
            int id = Integer.parseInt(leer.nextLine());
            boolean idValido = false;
            Administrador administrador = null;

            //Se comprueba que el ID corresponda a un administrador
            for (Administrador administrador1 : administradores) {
                if (administrador1.getId() == id) {
                    administrador = administrador1;
                    idValido = true;
                    break;
                }
            }

            System.out.println();

            //Si el ID es de un administrador se pide los datos de registro
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
                int caballos = Integer.parseInt(leer.nextLine());
                System.out.print("- Precio: ");
                float precio = Float.parseFloat(leer.nextLine());

                switch (vehiculo) {
                    case "coche":
                        System.out.print("- Número de puertas: ");
                        int nPuertas = Integer.parseInt(leer.nextLine());
                        System.out.print("- Número de asientos: ");
                        int nAsientos = Integer.parseInt(leer.nextLine());

                        coches.add(administrador.registrarCoche(matricula, marca, modelo, tipo, tipoCombustible, caballos, precio, nPuertas, nAsientos));

                        System.out.println();
                        System.out.println("El coche ha sido registrado con éxito.");
                        break;

                    case "moto":
                        motos.add(administrador.registrarMoto(matricula, marca, modelo, tipo, tipoCombustible, caballos, precio));

                        System.out.println();
                        System.out.println("La moto ha sido registrada con éxito.");
                        break;
                }
            } else {
                System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
            }
        } catch (Exception e) {
            System.out.println();
            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
        }
        System.out.println();
        otraOperacion();
    }

    /**
     * Metodo que permite visualizar los elementos de la lista que eliajamos
     * @param opcion1 lo que queremos ver (coches, motos, compradores, vendedores, administradores, comprador, vendedor, administrador)
     * @param opcion2 en el caso de querer ver compradores indica si venimos como vendedor o administrador
     */
    public void ver(String opcion1, String opcion2) {
        int id;
        boolean idValido = false;

        switch (opcion1) {
            case "coches":
                if (opcion2.equals("administrador")) {
                    try {
                        System.out.print("Introduzca su ID de administrador: ");
                        id = Integer.parseInt(leer.nextLine());

                        //Comprobamos si existe el administrador
                        for (Administrador administrador : administradores) {
                            if (administrador.getId() == id) {
                                idValido = true;
                                break;
                            }
                        }

                        System.out.println();

                        //Si el administrador existe imprimimos todos los elementos de la lista administradores
                        if (idValido) {
                            for (Coche coche : coches) {
                                System.out.println(coche.toString());
                            }
                        } else {
                            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                        }
                    } catch (Exception e) {
                        System.out.println(" ");
                        System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                    }
                } else {
                    System.out.println();
                    for (Coche coche : coches) {
                        if (coche.isDisponible()) {
                            System.out.println(coche);
                        }
                    }
                }
                break;

            case "motos":
                if (opcion2.equals("administrador")) {
                    try {
                        System.out.print("Introduzca su ID de administrador: ");
                        id = Integer.parseInt(leer.nextLine());

                        //Comprobamos si existe el administrador
                        for (Administrador administrador : administradores) {
                            if (administrador.getId() == id) {
                                idValido = true;
                                break;
                            }
                        }

                        System.out.println();

                        //Si el administrador existe imprimimos todos los elementos de la lista administradores
                        if (idValido) {
                            for (Moto moto : motos) {
                                System.out.println(moto.toString());
                            }
                        } else {
                            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                        }
                    } catch (Exception e) {
                        System.out.println(" ");
                        System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                    }
                } else {
                    System.out.println();
                    for (Moto moto : motos) {
                        if (moto.isDisponible()) {
                            System.out.println(moto);
                        }
                    }
                }
                break;

            case "administradores":
                try {
                    System.out.print("Introduzca su ID de administrador: ");
                    id = Integer.parseInt(leer.nextLine());

                    //Comprobamos si existe el administrador
                    for (Administrador administrador : administradores) {
                        if (administrador.getId() == id) {
                            idValido = true;
                            break;
                        }
                    }

                    System.out.println();

                    //Si el administrador existe imprimimos todos los elementos de la lista administradores
                    if (idValido) {
                        for(Administrador administrador: administradores){
                            System.out.println(administrador.toString());
                        }
                    } else {
                        System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                    }
                } catch (Exception e) {
                    System.out.println(" ");
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "compradores":
                try {
                    System.out.print("Introduzca su ID: ");
                    id = Integer.parseInt(leer.nextLine());

                    //Si venimos como administrador comprobamos si existe
                    if (opcion2.equals("administrador")) {
                        for (Administrador administrador : administradores) {
                            if (administrador.getId() == id) {
                                idValido = true;
                                break;
                            }
                        }
                    }

                    //Si venimos como vendedor comprobamos que existe
                    if (opcion2.equals("vendedor")) {
                        for (Vendedor vendedor : vendedores) {
                            if (vendedor.getId() == id) {
                                idValido = true;
                                break;
                            }
                        }
                    }

                    System.out.println();

                    //Si el ID es valido imprimimos los elementos de la lista compradores
                    if (idValido) {
                        for(Comprador comprador: compradores){
                            System.out.println(comprador.toString());
                        }
                    } else {
                        System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                    }
                } catch (Exception e) {
                    System.out.println();
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "vendedores":
                try {
                    System.out.print("Introduzca su ID: ");
                    id = Integer.parseInt(leer.nextLine());

                    //Comprobamos si existe el administrador
                    for (Administrador administrador : administradores) {
                        if (administrador.getId() == id) {
                            idValido = true;
                            break;
                        }
                    }

                    System.out.println();

                    //Si el ID es valido imprimimos los elementos de la lista vendedores
                    if (idValido) {
                        for(Vendedor vendedor: vendedores){
                            System.out.println(vendedor.toString());
                        }
                    } else {
                        System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                    }
                } catch (Exception e) {
                    System.out.println();
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "ventas":
                try {
                    System.out.print("Introduzca su ID de administrador: ");
                    id = Integer.parseInt(leer.nextLine());

                    //Comprobamos que existe el administrador
                    for (Administrador administrador : administradores) {
                        if (administrador.getId() == id) {
                            idValido = true;
                            break;
                        }
                    }

                    System.out.println();

                    //Si el administrador es valido imprimimos los elementos de la lista ventas
                    if (idValido) {
                        for(Venta venta: ventas){
                            System.out.println(venta.toString());
                        }
                    } else {
                        System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                    }
                } catch (Exception e) {
                    System.out.println();
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "comprador":
                try {
                    System.out.print("Introduzca su ID: ");
                    id = Integer.parseInt(leer.nextLine());
                    Comprador comprador = null;

                    //Comprobamos que existe el comprador
                    for (Comprador comprador1 : compradores) {
                        if (comprador1.getId() == id) {
                            comprador = comprador1;
                            idValido = true;
                            break;
                        }
                    }

                    System.out.println();

                    //Si el comprador es valido imprimimos el elemento de la lista compradores correspondiente a ese ID
                    if (idValido) {
                        System.out.println(comprador);
                    } else {
                        System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                    }
                } catch (Exception e) {
                    System.out.println();
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "vendedor":
                try {
                    System.out.print("Introduzca su ID: ");
                    id = Integer.parseInt(leer.nextLine());
                    Vendedor vendedor = null;

                    //Comprobamos que el vendedor existe
                    for (Vendedor vendedor1 : vendedores) {
                        if (vendedor1.getId() == id) {
                            vendedor = vendedor1;
                            idValido = true;
                            break;
                        }
                    }

                    System.out.println();

                    //Si el vendedor es valido imprimimos el elemento de la lista vendedores correspondiente a ese ID
                    if (idValido) {
                        System.out.println(vendedor);
                    } else {
                        System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                    }
                } catch (Exception e) {
                    System.out.println();
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;

            case "administrador":
                try {
                    System.out.print("Introduzca su ID: ");
                    id = Integer.parseInt(leer.nextLine());
                    Administrador administrador = null;

                    //Comprobamos que existe el administrador
                    for (Administrador administrador1 : administradores) {
                        if (administrador1.getId() == id) {
                            administrador = administrador1;
                            idValido = true;
                            break;
                        }
                    }

                    System.out.println();

                    //Si el administrador es valido imprimimos el elemento de la lista administradores correspondiente a ese ID
                    if (idValido) {
                        System.out.println(administrador);
                    } else {
                        System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                    }
                } catch (Exception e) {
                    System.out.println();
                    System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                }
                break;
        }
        System.out.println();

        if (!opcion2.equals("compra")) {
            otraOperacion();
        }
    }

    /**
     * Metodo que permite registrar personas
     * @param persona tipo de persona a registrar (administrador o vendedor)
     */
    public void registrarPersona(String persona) {
        try {
            System.out.print("Introduzca su ID de administrador: ");
            int id = Integer.parseInt(leer.nextLine());
            boolean idValido = false;
            Administrador administrador = null;

            //Comprobamos que existe el administrador
            for (Administrador administrador1 : administradores) {
                if (administrador1.getId() == id) {
                    administrador = administrador1;
                    idValido = true;
                    break;
                }
            }

            System.out.println();

            //Si el administrador es valido introducimos la informacion para registrar a la persona
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

                        System.out.println();
                        System.out.println("El administrador ha sido registrado con éxito.");
                        break;

                    case "vendedor":
                        System.out.print("- Sueldo: ");
                        float sueldo = Float.parseFloat(leer.nextLine());

                        int idVendedor = vendedores.size();
                        vendedores.add(administrador.registrarVendedor(idVendedor, nombre, apellido, dni, telefono, email, sueldo));

                        System.out.println();
                        System.out.println("El vendedor ha sido registrado con éxito.");
                        break;
                }
            } else {
                System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
            }
        } catch (Exception e) {
            System.out.println();
            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
        }

        System.out.println();
        otraOperacion();
    }

    /**
     * Metodo que permite registrar un comprador
     */
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

        System.out.println();
        System.out.println("Se ha registrado con éxito.");
        otraOperacion();
    }

    /**
     * Metodo que permite comprar un vehiculo
     * @param vehiculo tipo de vehiculo que queremos comprar (coche o moto)
     */
    public void comprarVehiculo(String vehiculo) {
        try {
            System.out.print("Introduzca su ID de usuario: ");
            int id = Integer.parseInt(leer.nextLine());
            boolean idValido = false;
            Comprador comprador = null;

            //Comprobamos si el comprador existe
            for (Comprador comprador1 : compradores) {
                if (comprador1.getId() == id) {
                    comprador = comprador1;
                    idValido = true;
                    break;
                }
            }

            //Si el comprador es valido registramos la venta
            if (idValido) {
                String matricula;
                switch (vehiculo) {
                    case "coche":
                        System.out.println();
                        System.out.println("Estos son los coches disponibles: ");
                        ver("coches", "compra");
                        System.out.println();
                        System.out.print("Indique la matrícula del coche que desea comprar: ");
                        matricula = leer.nextLine();

                        Coche coche = comprador.elegirCoche(coches, matricula);

                        if (coche == null) {
                            System.out.println();
                            System.out.println("Lo siento, el coche elegido no existe. Inténtelo de nuevo");
                        } else {
                            int idVenta = ventas.size();
                            Venta venta = new Venta(idVenta, coche.getPrecio(),null, comprador.getId(), coche.getMatricula());
                            ventas.add(venta);

                            coche.setDisponible(false);
                            comprador.comprarVehiculo(coche.getPrecio());

                            System.out.println();
                            System.out.println("La venta se ha registrado con éxito.");
                        }
                        break;

                    case "moto":
                        System.out.println();
                        System.out.println("Estas son las motos disponibles: ");
                        ver("motos", "compra");
                        System.out.println();
                        System.out.print("Indique la matrícula de la moto que desea comprar: ");
                        matricula = leer.nextLine();

                        Moto moto = comprador.elegirMoto(motos, matricula);

                        if (moto == null) {
                            System.out.println();
                            System.out.println("Lo siento, la moto elegida no existe. Inténtelo de nuevo");
                        } else {
                            int idVenta = ventas.size();
                            Venta venta = new Venta(idVenta, moto.getPrecio(), null, comprador.getId(), moto.getMatricula());
                            ventas.add(venta);

                            moto.setDisponible(false);
                            comprador.comprarVehiculo(moto.getPrecio());

                            System.out.println();
                            System.out.println("La venta se ha registrado con éxito.");
                        }
                        break;
                }
            } else {
                System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
            }
        } catch (Exception e) {
            System.out.println();
            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
        }

        System.out.println();
        otraOperacion();
    }

    /**
     * Metodo que permite vender vehiculos
     * @param vehiculo tipo de vehiculo que queremos vender (coche o moto)
     */
    public void venderVehiculo(String vehiculo) {
        try {
            System.out.print("Introduzca su ID de vendedor: ");
            int id = Integer.parseInt(leer.nextLine());
            boolean idValido = false;
            Vendedor vendedor = null;

            //Comprobamos que el vendedor existe
            for (Vendedor vendedor1 : vendedores) {
                if (vendedor1.getId() == id) {
                    vendedor = vendedor1;
                    idValido = true;
                    break;
                }
            }

            //Si el comprador es valido procedemos al registro
            if (idValido) {
                String matricula;
                boolean idCompradorValido = false;
                Comprador comprador = null;

                switch (vehiculo) {
                    case "coche":
                        System.out.println();
                        System.out.println("Estos son los coches disponibles: ");
                        ver("coches", "compra");
                        System.out.println();
                        System.out.print("Indique la matrícula del coche que desea vender: ");
                        matricula = leer.nextLine();
                        System.out.print("Indique el ID del comprador: ");
                        int idCompradorCoche = Integer.parseInt(leer.nextLine());

                        //Comprobamos que el comprador existe
                        for (Comprador comprador1 : compradores) {
                            if (comprador1.getId() == idCompradorCoche) {
                                comprador = comprador1;
                                idCompradorValido = true;
                                break;
                            }
                        }

                        //Si el comprador es valido registramos la venta
                        if (idCompradorValido) {
                            Coche coche = vendedor.elegirCoche(coches, matricula);

                            if (coche == null) {
                                System.out.println();
                                System.out.println("Lo siento, el coche elegido no existe. Inténtelo de nuevo");
                            } else {
                                int idVenta = ventas.size();
                                Venta venta = new Venta(idVenta, coche.getPrecio(), String.valueOf(vendedor.getId()), comprador.getId(), coche.getMatricula());
                                ventas.add(venta);

                                coche.setDisponible(false);
                                vendedor.venderVehiculo();
                                comprador.comprarVehiculo(coche.getPrecio());

                                System.out.println();
                                System.out.println("La venta se ha registrado con éxito.");
                            }
                        } else {
                            System.out.println();
                            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
                        }
                        break;

                    case "moto":
                        System.out.println();
                        System.out.println("Estos son las motos disponibles: ");
                        ver("motos", "compra");
                        System.out.println(" ");
                        System.out.print("Indique la matrícula de la moto que desea vender: ");
                        matricula = leer.nextLine();
                        System.out.print("Indique el ID del comprador: ");
                        int idCompradorMoto = Integer.parseInt(leer.nextLine());

                        //Comprobamos que el comprador existe
                        for (Comprador comprador1 : compradores) {
                            if (comprador1.getId() == idCompradorMoto) {
                                comprador = comprador1;
                                idCompradorValido = true;
                                break;
                            }
                        }

                        //Si el comprador es valido registramos la venta
                        if (idCompradorValido) {
                            Moto moto = vendedor.elegirMoto(motos, matricula);

                            if (moto == null) {
                                System.out.println();
                                System.out.println("Lo siento, la moto elegida no existe. Inténtelo de nuevo");
                            } else {
                                int idVenta = ventas.size();
                                Venta venta = new Venta(idVenta, moto.getPrecio(), String.valueOf(vendedor.getId()), comprador.getId(), moto.getMatricula());
                                ventas.add(venta);

                                moto.setDisponible(false);
                                vendedor.venderVehiculo();
                                comprador.comprarVehiculo(moto.getPrecio());

                                System.out.println();
                                System.out.println("La venta se ha registrado con éxito.");
                            }
                        }
                        break;
                }
            } else {
                System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
            }
        } catch (Exception e) {
            System.out.println();
            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
        }

        System.out.println();
        otraOperacion();
    }

    /**
     * Metodo que permite calcular el salario mensual de un vendedor
     */
    public void calcularSalarioVendedor() {
        try {
            System.out.print("Introduzca su ID de vendedor: ");
            int id = Integer.parseInt(leer.nextLine());
            boolean idValido = false;
            Vendedor vendedor = null;

            //Comprobamos que el vendedor existe
            for (Vendedor vendedor1 : vendedores) {
                if (vendedor1.getId() == id) {
                    vendedor = vendedor1;
                    idValido = true;
                    break;
                }
            }

            //Si el vendedor es valido procedemos al calculo
            if (idValido) {
                float salario = vendedor.calcularSalarioMensual();
                System.out.println();
                System.out.println("Su salario mensual es de " + salario + "€.");
            } else {
                System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
            }
        } catch (Exception e) {
            System.out.println();
            System.out.println("El ID introducido no es válido. Inténtelo de nuevo.");
        }

        System.out.println();
        otraOperacion();
    }

    /**
     * Metodo que pregunta si queremos realizar otra operacion despues de la realizada
     */
    private void otraOperacion() {

        System.out.print("¿Desea realizar otra operación?(S o N): ");
        String opcion = leer.nextLine();

        while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
            System.out.print("Opción incorrecta, escriba S o N: ");
            opcion = leer.nextLine();
        }

        if (opcion.equalsIgnoreCase("n")) {
            salir();
        }
    }

    /**
     * Metodo que cierra la aplicacion en caso de que queramos salir
     */
    private void salir() {
        System.out.print("¿Está seguro que quiere salir de la aplicación?(S o N): ");
        String opcion = leer.nextLine();

        while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
            System.out.print("Opción incorrecta, escriba S o N: ");
            opcion = leer.nextLine();
        }

        if (opcion.equalsIgnoreCase("s")) {
            System.out.println();
            System.out.println("                                      FIN DE EJECUCIÓN");
            System.out.println("_____________________________________________________________________________________________");
            salir = true;
        }
    }
}
