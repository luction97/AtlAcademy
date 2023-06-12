package org.ejerJava_clase6;

import java.util.Scanner;

/*
Arma un buscador de países con Google Maps.
Primero, pidele al usuario que ingrese un país (Ej: Colombia).
Después muestra en consola la concatenación de:
“https://www.google.com/maps/search/” + pais
Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.
*/
public class Act1_googleMaps {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un país");
        String pais = read.nextLine();
        System.out.println("https://www.google.com/maps/search/" + pais);
    }


}
