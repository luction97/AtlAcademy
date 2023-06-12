package org.ejerJava_clase6;


import java.util.Scanner;

/*
 * Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.*/
public class Act6_menorYmayor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("--------•Detectar número Mayor y Menor •---------");

        System.out.print("Ingrese un numero: ");
        int num1 = keyboard.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = keyboard.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num3 = keyboard.nextInt();

        int menor = obtenerMenor(num1, num2, num3);
        int mayor = obtenerMayor(num1, num2,num3);


        System.out.println("El menor es: "+menor);
        System.out.println("El mayor es: "+mayor);


    }

    public static int obtenerMayor(int a, int b, int c){
        int mayor = a;
        if (b > mayor){

            mayor = b;

        }

        if(c > mayor){
            mayor = c;
        }

            return mayor;
    }

    public static int obtenerMenor(int a, int b, int c){
    int menor = a;

    if (b < menor){
        menor = b;
    }
    if(c < menor){
        menor = c;
    }

    return menor;
    }

}
