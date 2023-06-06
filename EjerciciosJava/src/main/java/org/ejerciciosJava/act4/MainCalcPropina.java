package org.ejerciciosJava.act4;
/*
      Calculadora de propinas:
      Pídele al usuario que ingrese el total de la cuenta en un restaurante.
      Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
      Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/


import java.util.Scanner;

public class MainCalcPropina {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa el total de la cuenta.");
        Double totalCuenta = read.nextDouble();
        System.out.println("Ingrese el porcentaje de propina que desea dejar.");
        Double porcentajePropina = read.nextDouble();
        Double Propina = totalCuenta *(porcentajePropina/100);

        System.out.println("El monto de la propina es: " + Propina);

    }
}
