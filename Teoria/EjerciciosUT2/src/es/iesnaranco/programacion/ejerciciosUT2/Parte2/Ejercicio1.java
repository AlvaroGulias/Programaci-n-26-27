package es.iesnaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int perfileProcesar = 0, piezasValidas = 0;
        double LONGITUDMINIMA = 1.20, LONGITUDMAXIMA = 1.30, longitudPieza = 0.0;

        do{
            System.out.println("Introduce el numero de piezas que quieres porcesar: ");
            perfileProcesar = sc.nextInt();
        }while(perfileProcesar < 0);

        for (int i = 1; i <= perfileProcesar; i++){
            System.out.print("Introduce la longitud de la pieza " + i + ": ");
            longitudPieza = sc.nextDouble();

            if(longitudPieza >= LONGITUDMINIMA && longitudPieza <= LONGITUDMAXIMA){
                piezasValidas++;
            }
        }

        System.out.println("El numero de piezas válidas fueron: " + piezasValidas);
    }
}
