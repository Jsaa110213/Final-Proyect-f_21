package f_21_Conector;

import java.util.Scanner;
// import java.util.logging.Level; 
// import java.util.logging.Logger;

// Para poder hacer uso de esto(y que no arroje error), necesitamos primero arrancar XAMPP y encender MariaDB.
public class App {
    // Método principal que ejecuta el programa
    public static void main(String[] args) {
        // Instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar el menú principal
            System.out.println(" ");
            System.out.println("Bienvenido a la aplicacion de Servicios Escolares. ");
            System.out.println("Este proyecto esta desarrollando por el grupo TIDSM21. ");
            System.out.println("Integrantes del equipo: ");
            System.out.println("\n 1. Castillo Rodriguez Enrique - 2302045 ");
            System.out.println("\n 2. Guzman Perez Yair Gamaliel - 2302133 ");
            System.out.println("\n 3. Sanchez Trejo Cesar David - 2302073 ");
            System.out.println("\n 3. Santos Absalon Aaron de Jesus - 2302042 ");
            System.out.println(" ");
            System.out.println("\n---Menu--Principal---de---Gestores---");
            System.out.println("|1|. Gestor de Ciclos");
            System.out.println("|2|. Gestor de Cuatrimestres");
            System.out.println("|3|. Gestor de Ciclo_Cuatri");
            System.out.println("|0|. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt(); // Leer la opción del usuario
            scanner.nextLine(); // Limpiar el buffer del Scanner

            // Ejecutar la opción seleccionada
            switch (opcion) {
                case 1:
                    GestorCiclos gestorCiclos = new GestorCiclos(); // Crear una instancia de GestorCiclos
                    gestorCiclos.menu(); // Mostrar el menú de GestorCiclos
                    break;
                case 2:
                    GestorCuatri gestorCuatri = new GestorCuatri(); // Crear una instancia de
                                                                    // GestorCuatrimestres
                    gestorCuatri.menu(); // Mostrar el menú de GestorCuatrimestres
                    break;
                case 3:
                    GestorCC gestorCC = new GestorCC(); // Crear una instancia de GestorCC
                    gestorCC.menu(); // Mostrar el menú de GestorCC
                    break;
                case 0:
                    System.out.println("Saliendo..."); // Mensaje de salida
                    break;
                default:
                    System.out.println("Opcion invalida, por favor intente de nuevo."); // Mensaje para opción no válida
            }
        } while (opcion != 0); // Repetir hasta que el usuario elija salir

        scanner.close(); // Cerrar el Scanner
    }
}