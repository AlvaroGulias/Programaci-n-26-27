package es.iesnaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Ecuación de segundo grado: ");

        do{
            System.out.println("Introduce el varlo de a (distinto de 0): ");
            a = sc.nextDouble();

            if(a == 0){
                System.out.println("a ni puede ser 0");
            }
        }while(a == 0);

        System.out.println("Introduce el valor de b");
        b = sc.nextDouble();
        System.out.println("Introduce el valor de c");
        c = sc.nextDouble();

        double valor = b * b - 4 * a * c;

        if(valor < 0){
            System.out.println("No existen raices reales");
        }else if (valor == 0) {
            double x = -b / (2 * a);
            System.out.println("Solo existe una raiz: x = " + x);
        }else{
            double raiz = Math.sqrt(valor);
            double x1 = (-b + raiz) / (2 * a);
            double x2 = (-b - raiz) / (2 * a);
            System.out.println("Existen dos raices reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }

}
