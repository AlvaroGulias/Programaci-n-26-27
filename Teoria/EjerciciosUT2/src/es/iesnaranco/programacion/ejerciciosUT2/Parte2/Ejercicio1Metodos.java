package es.iesnaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio1Metodos {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run(){

        int introducirNumPiezas = introducirNumeroPiezas();
        int procesarPiezasValidas = ProcesarPiezasValidas(introducirNumPiezas);
        MostrarResultado(procesarPiezasValidas);
    }

    public static int introducirNumeroPiezas(){
        System.out.println("Introduce el número de piezas para hacer: ");
        return sc.nextInt();
    }

    public static int ProcesarPiezasValidas(int numeroPiezas){

        double longitudPieza = 0.0,LONGITUDMINIMA = 1.20, LONGITUDMAXIMA = 1.30;
        int piezasValidas = 0;

        for (int i = 1; i <= numeroPiezas; i++){
            System.out.print("Introduce la longitud de la pieza " + i + ": ");
            longitudPieza = sc.nextDouble();

            if(longitudPieza >= LONGITUDMINIMA && longitudPieza <= LONGITUDMAXIMA){
                piezasValidas++;
            }
        }
        return piezasValidas;
    }

    public static void MostrarResultado(int piezasAptas){
        System.out.println("Hay " + piezasAptas + " piezas que son válidas");
    }
}
