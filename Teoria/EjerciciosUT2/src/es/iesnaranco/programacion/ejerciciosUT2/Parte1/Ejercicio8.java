package es.iesnaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int numero = 0;
       int contador = 0;
        System.out.println("Introduce un numero: "); numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0){
                System.out.print(i + ", ");
                contador++;
            }
        }

        if (contador == 2){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
}
