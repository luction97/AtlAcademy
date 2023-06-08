package org.ejerciciosJava.act5;

import java.util.Scanner;

/*       5) Juego de adivinar el número:
          Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.*/
public class MainAdivinNum {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int numAleatorio = (int) (Math.random() * 100) + 1;
        System.out.println("Adivina el número..");
        int numUser = read.nextInt();

        if (numUser > numAleatorio) {
            System.out.println("El número es mayor que ese..");
        } else if (numUser < numAleatorio) {
            System.out.println("El número es menor que ese..");
        } else if (numUser == numAleatorio) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("!!ACERTASTE¡¡ Ganaste un millón de dolares.");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        }


    }
}
