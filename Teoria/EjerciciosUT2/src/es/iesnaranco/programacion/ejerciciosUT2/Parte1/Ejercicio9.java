package es.iesnaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte posicion = 0;

        System.out.println("Introduce tu posicion: "); posicion = sc.nextByte();

        switch (posicion){
            case 1:
                System.out.println("primer puesto, medalla de oro");
                break;
            case 2:
                System.out.println("segundo puesto, medalla de plata");
                break;
            case 3:
                System.out.println("tercer puesto, medalla de bronce");
                break;
            default:
                System.out.println("gracias por participar");
                break;
        }
    }
}
