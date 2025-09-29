package edu.rico.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Aplicación Iniciada");
        System.out.println("Introduce un precio: ");
        Scanner sc = new Scanner(System.in);
        //un precio puede ser decimal, así que lo leeremos del teclado usando "nextDouble()"
        //a la hora de introducir por teclado un decimal, usamos la coma para separar la parte decimal de la parte entera
        //a la hora de asignar un valor sin usar teclado, los decimales separan la parte entera de la decimal con un punto
        double precio = sc.nextDouble();

        if(precio>=100){
            double precioRebajado = precio - precio*0.15;
            System.out.println(precioRebajado);
        }else {
            System.out.println("El precio es de: " + precio);
        }
        System.out.println("FIN");
    }
}
