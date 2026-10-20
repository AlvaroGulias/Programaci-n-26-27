package es.iesnaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte posicion = 0;

        System.out.println("Introduce tu posicion: "); posicion = sc.nextByte();

        switch (posicion){
            case 1:
                System.out.println("primer puesto");
                break;
            case 2:
                System.out.println("segundo puesto");
                break;
            case 3:
                System.out.println("tercer puesto");
                break;
            default:
                System.out.println("gracias por participar");
                break;
        }
    }
}
