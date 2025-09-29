package edu.rico.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Programa iniciado");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        //Podemos leer texto con next() y con nextLine()
        String nombreUsuario =  sc.nextLine();
        //para comparar cadenas de texto usamos .equals en lugar de usar ==
        if(nombreUsuario.equals("admin")){
            System.out.println("Bienvenido administrador!!!");
        }else{
            System.out.println("USUARIO NO VALIDO");
        }
        System.out.println("FIN");
    }
}
