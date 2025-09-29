package edu.rico.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Aplicación iniciada");
        System.out.println("Introduce un número entero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        //Sabemos que si dividimos entre 2 y de resto queda 0 => el número es par
        //con "/" dividimos y obtenemos el cociente. Con el operador módulo "%" obtenemos el resto
        if(numero%2==0){// usamos "==" como comparador porque comparamos número
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }

    }
}
