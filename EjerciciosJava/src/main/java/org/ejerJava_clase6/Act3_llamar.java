package org.ejerJava_clase6;

import java.util.Scanner;

/*
* Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
Después muestra en consola la concatenación de:
“https://api.whatsapp.com/send?phone=” + telefono
*/
public class Act3_llamar {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese un número de telefono: ");
        String telefono = read.next();

        System.out.println("https://wa.me/" + telefono);


    }
}
