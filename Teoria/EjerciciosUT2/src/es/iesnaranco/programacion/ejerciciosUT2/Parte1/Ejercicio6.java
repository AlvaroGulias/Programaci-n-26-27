package es.iesnaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte numero = 0;

        do{
            System.out.println("Introduce un numero entre 1 y 7: "); numero = sc.nextByte();
        }while(numero < 0 || numero >= 7);

        short numero_factorial = 1;

        if(numero == 0){
            System.out.println(numero_factorial);
        }else{
            for (int i = 1; i <= numero; i++) {
                numero_factorial *= (short) i;
            }
            System.out.println(numero_factorial);
        }


    }
}
