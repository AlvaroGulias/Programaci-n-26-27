package es.iesnaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte numero_mes = 0;
        short numero_anio = 0;

        do{
            System.out.println("Introduce numero del mes"); numero_mes = sc.nextByte();
        }while(numero_mes < 1 || numero_mes > 12);

        System.out.println("introduce el año: "); numero_anio = sc.nextShort();

        switch (numero_mes){
            case 2:
                if((numero_anio % 4 == 0 && numero_anio % 100 != 0) || numero_anio % 400 == 0){
                    System.out.println("El mes tiene 29 dias y es bisiesto");
                }else{
                    System.out.println("El mes tiene 28 dias");
                }
                break;
            case 4, 6, 9, 11:
                System.out.println("El mes tiene 30 dias");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("El mes tiene 31 dias");
                break;
            default:
                System.out.println("Hubo un error");
                break;
        }

    }
}
