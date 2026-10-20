package es.iesnaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float presion = 0.0f;
        String nombre = "";

        System.out.println("Mete la presion: "); presion = sc.nextFloat();

        if(presion > 2.0){
            System.out.println("Abrir valvula de seguridad");
            while(presion > 2.0){
                presion--;
            }
        }else{
            System.out.println("Introduce tu nombre: "); nombre = sc.next();
            System.out.println("Todo está bien " + nombre);
        }
    }
}
