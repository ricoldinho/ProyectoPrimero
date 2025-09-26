package edu.rico.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Bienvenido al detector de menores");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        //inicializamos el valor de la variable edad
        int edad = sc.nextInt();
        if (edad < 18){
            System.out.println("El usuario es menor de edad");
        }else {
            System.out.println("El usuario es mayor de edad");
        }
    }
}
