package org.ejerJava_clase6;

import java.util.Scanner;

/*
 * Armar un programa que permita cargar 3 números y mostrar cual es el número promedio.
 * */
public class Act5_numPromedio {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Ingresa el primer número");
            int num1 = keyboard.nextInt();
            System.out.println("Ingresa el segundo número");
            int num2 = keyboard.nextInt();
            System.out.println("Ingresa el tercer número");
            int num3 = keyboard.nextInt();

            int promedio = (num1 + num2 + num3) / 3;
            System.out.println("El promedio es: " + promedio);

            System.out.println("¿Deseas volver a ingresar números?Si/No");
             respuesta = keyboard.next();

        } while (!respuesta.equalsIgnoreCase("no"));

        System.out.println("Programa finalizado.");
    }

}
