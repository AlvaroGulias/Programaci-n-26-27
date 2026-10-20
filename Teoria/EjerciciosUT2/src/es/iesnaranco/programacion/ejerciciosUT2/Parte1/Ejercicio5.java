package es.iesnaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte numero = 0;

        do{
            System.out.println("Introduce numero: "); numero = sc.nextByte();

        }while(numero < 1 || numero > 20);

        //numeros naturales

        byte suma_numeros_naturales = 0;

        for (int i = 1; i <= numero; i++){
            suma_numeros_naturales += (byte) i;
        }

        System.out.println("Suma de los números naturales: " + suma_numeros_naturales);

        //numeros pares

        byte suma_numeros_pares = 0;

        for (int i = 1; i <= numero; i++) {
            if(i % 2 == 0){
                suma_numeros_pares += (byte) i;
            }
        }
        System.out.println("Suma de los números pares: " + suma_numeros_pares);

        //numeros impares

        byte suma_numeros_impares = 0;

        for (int i = 1; i <= numero; i++) {
            if(i % 2 == 1){
                suma_numeros_impares += (byte) i;
            }
        }
        System.out.println("Suma de los números impares: " + suma_numeros_impares);

        //cuadrados

        int suma_numeros_cuadrados = 0;

        for (int i = 0; i <= numero; i++) {
            suma_numeros_cuadrados += Math.pow(i, 2);
        }

        System.out.println("Suma de los números cuadrados: " + suma_numeros_cuadrados);
    }
}
