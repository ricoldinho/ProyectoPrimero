package edu.rico.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //pedir datos por consola
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer número: ");
        //guardamos el primer número en la referencia numero1
        /* recordad que los métodos de lectura de datos del Scanner son bloqueantes
           , es decir, pausan la ejecución del código
        */
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese el valor del segundo número: ");
        //guardamos el primer número en la referencia numero1
        int numero2 = teclado.nextInt();

        int resultadoSuma = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        int resultadoResta = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultadoResta);

        int resultadoMultiplicacion = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);

        //recordemos que el denominador NO puede ser 0
        //hay que recordar también que una división puede devolver un número decimal
        int resultadoDivision = numero1 / numero2;
        System.out.println("El resultado de la división es: " + resultadoDivision);
    }
}
