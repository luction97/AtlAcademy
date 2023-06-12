package org.ejerJava_clase6;


import java.util.Scanner;

/*
* Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
Después muestra en consola la concatenación de:
“https://twitter.com/search?q=” + palabra
* */
public class Act2_Twitter {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String celebridad = read.next();
        String url = "https://twitter.com/search?q=" + celebridad;
        System.out.println(url);

    }


}
