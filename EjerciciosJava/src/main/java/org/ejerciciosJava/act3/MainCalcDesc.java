package org.ejerciciosJava.act3;

import java.util.Scanner;

/*        3) Calculadora de descuento:
       Pídele al usuario que ingrese el precio original de un producto.
        Pídele al usuario que ingrese el porcentaje de descuento.
       Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
       Muestra el precio final al usuario. */
public class MainCalcDesc {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el precio original: ");
        double precioOriginal = read.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: ");
        double porcentajeDescuento = read.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * porcentajeDescuento / 100);
        System.out.println("El precio final es: " + precioFinal);

    }
}
