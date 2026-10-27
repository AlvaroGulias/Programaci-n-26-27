package es.iesnaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio4 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        int posicion = introducirPosicion();
        int valor = calcularNumero(posicion);
        visualizarNumero(posicion,valor);
    }

    public static int introducirPosicion(){
        int posicion = 0;

        do{
            System.out.println("introduce un numero positivo para calcular la posicion: ");
            posicion = sc.nextInt();
        }while(posicion <= 0);

        return posicion;
    }

    public static int calcularNumero(int posicion){
        int num1 = 0, num2 = 1;

        for (int i = 1; i < posicion; i++) {
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }

        return num1;
    }

    public static void visualizarNumero(int posicion, int valor){
        System.out.println("En la posición " + posicion  + " está el valor: " + valor);
    }
}
