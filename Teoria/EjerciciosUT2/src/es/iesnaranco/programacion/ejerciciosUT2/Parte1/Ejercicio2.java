package es.iesnaranco.programacion.ejerciciosUT2.Parte1;
import  java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte MiEdad = 0, edadCompaniero = 0;

        System.out.println("Tu edad: "); MiEdad = sc.nextByte();
        System.out.println("Edad compañero"); edadCompaniero = sc.nextByte();

        if(MiEdad > edadCompaniero){
            System.out.println("Soy mayor que mi copañero");
        } else if (MiEdad < edadCompaniero) {
            System.out.println("Soy menor que mi compañero");
        }else{
            System.out.println("Somos de la misma edad");
        }
    }
}
