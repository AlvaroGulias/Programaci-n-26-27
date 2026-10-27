package es.iesnaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio5 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        int numero = leerNumero();
        comprobarNumero(numero);
    }

    public static int leerNumero(){
        System.out.println("Introduce un numero de 4 dígitos: ");
        return sc.nextInt();
    }

    public static int comprobarNumero(int numero){

        do{
            System.out.println("Introduce un numero de 4 dígitos: ");
            numero = sc.nextInt();
        }while (numero > 9999 || numero < 1000);

        return numero;
    }

    public static void determinarParImpar(int numero){

        int contadorPar = 0, contadorImpar = 0;

        for (int i = 0; i <= numero; i++) {
            if(numero % 10 == 2){
                
            }
        }
    }
}
