package es.iesnaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejericicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeros = 0, FIN = 0, valor = 0;

        do{

            System.out.println("Introduce numero, para finalizar pon 0");
            numeros = sc.nextInt();

            if(numeros == FIN){
                System.out.println("Fin");
            }else if(numeros <= 8){
                valor = numeros * 3;
                System.out.println(valor);
            } else if (numeros > 8) {
                valor = numeros * 2;
                System.out.println(valor);
            }

        }while(numeros != FIN);
    }
}
