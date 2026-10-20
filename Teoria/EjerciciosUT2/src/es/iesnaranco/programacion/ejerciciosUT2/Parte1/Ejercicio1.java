package es.iesnaranco.programacion.ejerciciosUT2.Parte1;
import  java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        System.out.println("Escribe el numero: "); numero = sc.nextInt();

        if(numero == 1){
            System.out.println("El numero es 1");
        }else if(numero == 2){
            System.out.println("El numero es 2");
        }else{
            System.out.println("es otro número distinto de uno y dos ");
        }
    }
}
