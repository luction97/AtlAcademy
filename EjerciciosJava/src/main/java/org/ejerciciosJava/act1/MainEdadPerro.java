package org.ejerciciosJava.act1;

import java.util.Scanner;
/*1)
    Calculadora de edad de perros:
    Pídele al usuario que ingrese la edad de su perro.
    Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
*/
public class MainEdadPerro {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro");
        int edadHuman = read.nextInt();
        int edadDog = edadHuman *7;
        System.out.println("La edad de su perro en edad perro es de "+edadDog+" años.");

    }
}








