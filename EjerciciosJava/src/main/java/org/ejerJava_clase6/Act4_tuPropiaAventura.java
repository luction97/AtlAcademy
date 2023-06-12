package org.ejerJava_clase6;

import java.util.Scanner;

/*
Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.

* */
public class Act4_tuPropiaAventura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        System.out.println("¡Bienvenido a la aventura!");

        while (!juegoTerminado) {
            System.out.println("Elige una opción:");
            System.out.println("1. Ir a la cueva oscura");
            System.out.println("2. Caminar por el bosque encantado");
            System.out.println("3. Salir del juego");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    opcionCuevaOscura(scanner);
                    break;
                case 2:
                    opcionBosqueEncantado(scanner);
                    break;
                case 3:
                    juegoTerminado = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
                    break;
            }
        }

        System.out.println("¡Gracias por jugar!");
    }

    public static void opcionCuevaOscura(Scanner scanner) {
        System.out.println("\nEstás en la cueva oscura. ¿Qué haces?");
        System.out.println("1. Encender una linterna");
        System.out.println("2. Seguir adelante sin luz");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                System.out.println("\nEnciendes la linterna y puedes ver claramente el camino. ¡Llegas a salvo al otro lado de la cueva!");
                break;
            case 2:
                System.out.println("\nDecides seguir adelante a oscuras, pero te tropiezas y te lastimas. Tienes que regresar al inicio.");
                break;
            default:
                System.out.println("Opción inválida. Intenta nuevamente.");
                opcionCuevaOscura(scanner);
                break;
        }
    }

    public static void opcionBosqueEncantado(Scanner scanner) {
        System.out.println("\nEstás en el bosque encantado. ¿Qué haces?");
        System.out.println("1. Seguir el sendero iluminado");
        System.out.println("2. Tomar un atajo por la maleza");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                System.out.println("\nSigues el sendero iluminado y encuentras un tesoro escondido. ¡Has ganado!");
                break;
            case 2:
                System.out.println("\nDecides tomar el atajo por la maleza, pero te pierdes y no encuentras el camino de regreso. Tienes que volver al inicio.");
                break;
            default:
                System.out.println("Opción inválida. Intenta nuevamente.");
                opcionBosqueEncantado(scanner);
                break;
        }
    }
}
