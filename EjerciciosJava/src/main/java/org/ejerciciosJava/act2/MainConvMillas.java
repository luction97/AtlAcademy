package org.ejerciciosJava.act2;

import java.util.Scanner;

/*
   Conversor de millas a kilómetros:
   Pídele al usuario que ingrese una distancia en millas.
   Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
   Muestra la distancia en kilómetros al usuario.
*/
public class MainConvMillas {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una distancia en millas para convertirla a kilómetros.");
        double milla = read.nextDouble();

        double kilometro =  milla * 1.60934;

        System.out.println("La distancia de "+milla+" millas es de "+kilometro+ " kilometros.");




    }
}
