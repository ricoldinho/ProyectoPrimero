package edu.rico.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a nuestra calculadora de área de triángulos");
        Scanner sc = new Scanner(System.in);
        //declaración variable
        int base;
        //asignación de un valor a una variable
        System.out.println("Ingrese el numero base (entero): ");
        base = sc.nextInt();
        //podemos hacer declaración y asignación en una línea
        System.out.println("Ingrese el numero altura (entero): ");
        int altura = sc.nextInt();
        //como hay una división, declaramos el resultado como decimal
        double area =  (double) (base * altura)/2;//el "(double)" es un cast que especifica que el resultado de la operacion será un double
        System.out.println("El área del triángulo es: " + area);
    }
}
