package principal;

import archivo.LeerArchivoCsv;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import model.Transaccion;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        List<Transaccion> transacciones;
        do {
            System.out.println("MENU");
            System.out.println("====");
            System.out.println("(1) MOSTRAR TODOS LAS TRANSACCIONES EN PANTALLA");
            System.out.println("(2) MOSTRAR LAS VENTAS TOTALES POR CATEGORIA");
            System.out.println("(3) MOSTRAR LAS VENTAS TOTALES POR CIUDAD");
            System.out.println("(4) MOSTRAR LA CIUDAD CON LA MAYOR VENTA EN LA CATEGORIA INFORMATICA");
            System.out.println("(5) MOSTRAR LA FORMA DE PAGO QUE TUBO LA MAYOR VENTA");
            System.out.println("(0) SALIR");

            System.out.print("INGRESE OPCION? ");
            opcion = sc.next();

            switch (opcion) {
                case "1":
                    cls();
                    System.out.println("OPCION 1");
                    System.out.println("========");
                    transacciones = LeerArchivoCsv.obtenerDatos();
                    for (Transaccion t : transacciones) {
                        System.out.println(t.toString());
                    }
                    pause();
                    break;
                case "2":
                    cls();
                    System.out.println("OPCION 2");
                    System.out.println("========");
                    transacciones = LeerArchivoCsv.obtenerDatos();
                    double ai = 0;
                    for (Transaccion t : transacciones) {
                        if (t.getCategoria().equalsIgnoreCase("Informática")) {
                            ai = ai + t.getVentas();
                        }
                    }
                    System.out.println("Categoría Informática: " + ai);
                    pause();
                    break;
                case "3":
                    cls();
                    System.out.println("OPCION 3");
                    /*
                    transacciones = LeerArchivoCsv.obtenerDatos();
                    for (Transaccion t : transacciones) {
                        if (t.getCategoria().equalsIgnoreCase("Informática")) {
                            ai = ai + t.getVentas();
                        }
                    }*/
                    pause();
                    break;
                case "4":
                    cls();
                    System.out.println("OPCION 4");
                    pause();
                    break;
                case "5":
                    cls();
                    System.out.println("OPCION 5");
                    pause();
                    break;
                case "0":
                    cls();
                    System.out.println("GRACIAS POR SI VISITA");
                    pause();
                    System.exit(0);
                    break;
            }
        } while (true);

    } // FIN MAIN

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }

} // FIN CLASE
